package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.controller;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MSProduct;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response.MSListOfProducts;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.service.MasterSupermercadosService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("masterSupermercados")
public class MSController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MSController.class);

    private MasterSupermercadosService masterSupermercadosService;

    @Autowired
    public MSController(MasterSupermercadosService masterSupermercadosService) {
        this.masterSupermercadosService=masterSupermercadosService;
    }

    @GetMapping("search/{product}")
    public ResponseEntity<MSListOfProducts> getProducts(@PathVariable String product) {
        MSListOfProducts MSListOfProducts = masterSupermercadosService.getProducts(product);
        return new ResponseEntity<>(MSListOfProducts, HttpStatus.OK);
    }

    @GetMapping("search/lowest/{product}")
    public ResponseEntity<List<MSProduct>> getLowestValue(@PathVariable String product) {
        List<MSProduct> MSProductList = masterSupermercadosService.getProducts(product)
                .getProdutos()
                .stream()
                .sorted(Comparator.comparing(MSProduct::getMny_vlr_produto_por))
                .collect(Collectors.toList());
        return new ResponseEntity<>(MSProductList,HttpStatus.OK);
    }

}
