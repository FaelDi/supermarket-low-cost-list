package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.controller;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http.MasterSupermercadosResponseProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic.MasterSupermercadosImpl;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosProduct;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service.MasterSupermercadosService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MasterSupermercadosControllerTest {

    @Mock
    private MasterSupermercadosImpl masterSupermercadosImpl = Mockito.mock(MasterSupermercadosImpl.class);

    @InjectMocks
    private MasterSupermercadosService masterSupermercadosService = new MasterSupermercadosService(masterSupermercadosImpl);

    @InjectMocks
    private MasterSupermercadosController masterSupermercadosController = new MasterSupermercadosController(masterSupermercadosService);

    @Test
    public void getProduct() throws IOException, InterruptedException {
        ArrayList<MasterSupermercadosProduct> arrayList = new ArrayList<>();
        MasterSupermercadosResponseProducts masterSupermercadosResponseProductsMock =
                MasterSupermercadosResponseProducts.builder().produtos(arrayList).build();
        when(masterSupermercadosImpl.getProducts("teste")).thenReturn(masterSupermercadosResponseProductsMock);
        when(masterSupermercadosService.getProducts("teste")).thenReturn(masterSupermercadosResponseProductsMock);

        MasterSupermercadosResponseProducts masterSupermercadosResponseProducts = masterSupermercadosController.getProducts("teste");
        assertEquals(masterSupermercadosResponseProductsMock,masterSupermercadosResponseProducts);
    }
}