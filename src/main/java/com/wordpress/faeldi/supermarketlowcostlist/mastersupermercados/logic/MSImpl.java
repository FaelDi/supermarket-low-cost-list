package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.request.MSRequestProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MSListOfProducts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import static com.wordpress.faeldi.supermarketlowcostlist.utils.CommonConstants.MASTER_SUPERMERCADOS_BASEURL;
import static com.wordpress.faeldi.supermarketlowcostlist.utils.CommonConstants.MASTER_SUPERMERCADOS_API_BUSCA;

@Component
public class MSImpl {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MSImpl.class);

    private RestTemplate restTemplate;

    @Autowired
    public MSImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    //@Retryable(value = RuntimeException.class,maxAttempts = 3,backoff = @Backoff(3000))
    public MSListOfProducts getProducts(String product) {
        LOGGER.info("buscando por produto: "+product);
        MSRequestProducts MSRequestProducts = createRequest(product);
        HttpEntity<MSRequestProducts> request = new HttpEntity<>(MSRequestProducts);
        LOGGER.info("request criado: "+ MSRequestProducts.toString());
        MSListOfProducts masterSupermercadosProducts = restTemplate.postForObject(MASTER_SUPERMERCADOS_BASEURL+MASTER_SUPERMERCADOS_API_BUSCA,request, MSListOfProducts.class);
        LOGGER.info("busca realizada: "+masterSupermercadosProducts.toString());
        return insertBaseUrl(masterSupermercadosProducts);
    }

    private MSListOfProducts insertBaseUrl(MSListOfProducts MSListOfProducts) {
        MSListOfProducts.getProdutos().stream().forEach(masterSupermercadosProduct -> masterSupermercadosProduct.setStr_link_produto(MASTER_SUPERMERCADOS_BASEURL+"/produto/"+masterSupermercadosProduct.getStr_link_produto()));
        return MSListOfProducts;
    }

    private MSRequestProducts createRequest(String product) {
        return MSRequestProducts
                .builder()
                .descricao(product)
                .order("MV")
                .pg(1)
                .marcas(Arrays.asList())
                .categorias(Arrays.asList())
                .subCategorias(Arrays.asList())
                .precoIni(0)
                .precoFim(0)
                .avalicaoes(Arrays.asList())
                .num_reg_pag(30)
                .visualizacao("CARD").build();
    }

}
