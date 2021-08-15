package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http.MasterSupermercadosResponseProducts;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MasterSupermercadosImplTest {

    @Test
    public void getProducts() throws IOException, InterruptedException {
        MasterSupermercadosImpl masterSupermercados = new MasterSupermercadosImpl();
        MasterSupermercadosResponseProducts masterSupermercadosResponseProducts = masterSupermercados.getProducts("chocolate");
        assertEquals(30,masterSupermercadosResponseProducts.getProdutos().size());
    }
}