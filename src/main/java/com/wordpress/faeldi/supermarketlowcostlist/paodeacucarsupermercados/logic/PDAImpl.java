package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.logic;

import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response.PDAListOfProducts;
import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response.PDAResponsePrice;
import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response.PDAResponseProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.wordpress.faeldi.supermarketlowcostlist.utils.CommonConstants.*;

@Component
public class PDAImpl {

    private RestTemplate restTemplate;

    private final String TARGET = "{product}";

    @Autowired
    public PDAImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PDAListOfProducts getProducts(String product) {
        PDAListOfProducts products = restTemplate.getForObject(PAO_DE_ACUCAR_BASEURL_WITH_PARAMETERS.replace(TARGET,product),PDAListOfProducts.class);
        return getPricesFromProducts(products);
    }

    public PDAListOfProducts getPricesFromProducts(PDAListOfProducts products) {
        List<String> stringList = products.getResults().stream().map(pdaProduct -> removeBaseURlProduct(pdaProduct.getUrl())).collect(Collectors.toList());
        HttpEntity<List<String>> request = new HttpEntity<>(stringList);
        restTemplate.setInterceptors(Collections.singletonList(new JsonMimeReqInterceptor()));
        PDAResponsePrice pdaResponsePrice = restTemplate.postForObject(PAO_DE_ACUCAR_GET_PRICES,request, PDAResponsePrice.class);
        products.getResults()
                .forEach(pdaProduct -> pdaProduct
                        .setPrice(pdaResponsePrice
                                .getContent()
                                .stream()
                                .filter(pdaResponseProduct -> String.valueOf(pdaResponseProduct
                                        .getId())
                                        .equals(removeBaseURlProduct(pdaProduct.getUrl()))).findFirst().orElse(new PDAResponseProduct()).getPrice()));
        return products;
    }

    private String removeBaseURlProduct(String url) {
        return url.replace(PAO_DE_ACUCAR_BASEURL+PAO_DE_ACUCAR_BASEURL_API_PRODUTO,EMPTY);
    }

    public static class JsonMimeReqInterceptor implements ClientHttpRequestInterceptor {

        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body,
                                            ClientHttpRequestExecution execution) throws IOException {
            HttpHeaders headers = request.getHeaders();
            headers.add(HttpHeaders.ACCEPT, String.valueOf(MediaType.APPLICATION_JSON));
            return execution.execute(request, body);
        }
    }
}
