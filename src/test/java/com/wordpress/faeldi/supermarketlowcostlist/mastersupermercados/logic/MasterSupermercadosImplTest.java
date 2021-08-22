//package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic;
//
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MasterSupermercadoSearchResponse;
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MasterSupermercadosListOfProducts;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MasterSupermercadosImplTest {
//
//    @Test
//    public void getProducts() throws IOException, InterruptedException {
//        MasterSupermercadosImpl masterSupermercados = new MasterSupermercadosImpl();
//        MasterSupermercadoSearchResponse masterSupermercadoSearchResponse = masterSupermercados.getProducts("chocolate");
//        assertEquals(30, masterSupermercadoSearchResponse.getMasterSupermercadosListOfProducts().getProdutos().size());
//    }
//}