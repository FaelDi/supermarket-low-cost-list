package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.controller;

import com.wordpress.faeldi.supermarketlowcostlist.exceptions.Error;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosProduct;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosResponseProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service.MasterSupermercadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("masterSupermercados")
public class MasterSupermercadosController {

    @Autowired
    private MasterSupermercadosService masterSupermercadosService;

    @Autowired
    public MasterSupermercadosController(MasterSupermercadosService masterSupermercadosService) {
        this.masterSupermercadosService=masterSupermercadosService;
    }

    @GetMapping("search/{product}")
    public MasterSupermercadosResponseProducts getProducts(@PathVariable String product) throws IOException, InterruptedException {
        return masterSupermercadosService.getProducts(product);
    }

    @GetMapping("search/menorValor/{product}")
    public Object getLowestValue(@PathVariable String product) throws IOException, InterruptedException {
        MasterSupermercadosProduct masterSupermercadosProduct = masterSupermercadosService.getLowestPrice(product);
        if(masterSupermercadosProduct != null) {
            return masterSupermercadosProduct;
        }
        return Error.builder().error("Nao encontrado").build();
    }

}
