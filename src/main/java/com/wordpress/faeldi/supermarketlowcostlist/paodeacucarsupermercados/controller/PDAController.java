package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.controller;

import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.logic.PDAImpl;
import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response.PDAListOfProducts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paodeacucar")
public class PDAController {

    private PDAImpl pdaImpl;

    @Autowired
    public PDAController(PDAImpl pdaImpl) {
        this.pdaImpl = pdaImpl;
    }

    @GetMapping("/search/{product}")
    public ResponseEntity<PDAListOfProducts> getProducts(@PathVariable("product") String product) {
        PDAListOfProducts products = pdaImpl.getProducts(product);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
