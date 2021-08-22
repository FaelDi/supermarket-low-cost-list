package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MSListOfProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.logic.MSImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterSupermercadosService {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MasterSupermercadosService.class);

    @Autowired
    private MSImpl MSImpl;

    @Autowired
    public MasterSupermercadosService(MSImpl MSImpl) {
        this.MSImpl = MSImpl;
    }

    public MSListOfProducts getProducts(String product) {
        return MSImpl.getProducts(product);
    }

}
