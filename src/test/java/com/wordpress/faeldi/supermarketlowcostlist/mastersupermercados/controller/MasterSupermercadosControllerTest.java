//package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.controller;
//
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MasterSupermercadoSearchResponse;
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MasterSupermercadosListOfProducts;
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic.MasterSupermercadosImpl;
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosProduct;
//import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service.MasterSupermercadosService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//class MasterSupermercadosControllerTest {
//
//    @Mock
//    private MasterSupermercadosImpl masterSupermercadosImpl = Mockito.mock(MasterSupermercadosImpl.class);
//
//    @InjectMocks
//    private MasterSupermercadosService masterSupermercadosService = new MasterSupermercadosService(masterSupermercadosImpl);
//
//    @InjectMocks
//    private MasterSupermercadosController masterSupermercadosController = new MasterSupermercadosController(masterSupermercadosService);
//
//    @Test
//    public void getProduct() throws IOException, InterruptedException {
//        ArrayList<MasterSupermercadosProduct> arrayList = new ArrayList<>();
//        MasterSupermercadosListOfProducts masterSupermercadosListOfProductsMock =
//                MasterSupermercadosListOfProducts.builder().produtos(arrayList).build();
//        MasterSupermercadoSearchResponse masterSupermercadoSearchResponseMock = MasterSupermercadoSearchResponse.builder().masterSupermercadosListOfProducts(masterSupermercadosListOfProductsMock).msg("").build();
//        when(masterSupermercadosImpl.getProducts("teste")).thenReturn(masterSupermercadoSearchResponseMock);
//        when(masterSupermercadosService.getProducts("teste")).thenReturn(masterSupermercadoSearchResponseMock);
//        MasterSupermercadoSearchResponse masterSupermercadoSearchResponse = masterSupermercadosController.getProducts("teste");
//        assertEquals(masterSupermercadosListOfProductsMock, masterSupermercadoSearchResponse.getMasterSupermercadosListOfProducts());
//    }
//}