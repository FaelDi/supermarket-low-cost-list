package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosProduct;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosResponseProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic.MasterSupermercadosImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class MasterSupermercadosService {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MasterSupermercadosService.class);

    @Autowired
    private MasterSupermercadosImpl masterSupermercadosImpl;

    @Autowired
    public MasterSupermercadosService(MasterSupermercadosImpl masterSupermercadosImpl) {
        this.masterSupermercadosImpl = masterSupermercadosImpl;
    }

    public MasterSupermercadosResponseProducts getProducts(String product) throws IOException, InterruptedException {
        return masterSupermercadosImpl.getProducts(product);
    }

    public MasterSupermercadosProduct getLowestPrice(String product) throws IOException, InterruptedException {
        return masterSupermercadosImpl.getLowestPrice(product);
    }

}
