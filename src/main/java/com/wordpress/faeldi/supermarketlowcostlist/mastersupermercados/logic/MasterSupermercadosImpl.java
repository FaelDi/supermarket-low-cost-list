package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http.MasterSupermercadosRequestProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http.MasterSupermercadosResponseProducts;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Component
public class MasterSupermercadosImpl {

    public MasterSupermercadosResponseProducts getProducts(String product) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();
        ObjectMapper objectMapper = new ObjectMapper();
        MasterSupermercadosRequestProducts masterSupermercadosRequestProducts =
                MasterSupermercadosRequestProducts
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

        String requestBody = objectMapper.writeValueAsString(masterSupermercadosRequestProducts);
        var request = HttpRequest.newBuilder(
                URI.create("https://loja.mastersupermercados.com.br/api/busca"))
                .header("accept","application/json")
                .header("Content-Type","application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody, StandardCharsets.UTF_8))
                .build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String object = response.body();

        MasterSupermercadosResponseProducts masterSupermercadosProducts = objectMapper.readValue(object, MasterSupermercadosResponseProducts.class);
        return masterSupermercadosProducts;
    }
}
