package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MasterSupermercadosRequestProductsTest {

    private final String DESCRICAO = "teste";
    private final String ORDER = "MV";
    private final int PG = 1;
    private final List<String> MARCAS = Arrays.asList();
    private final List<String> CATEGORIAS = Arrays.asList();
    private final List<String> SUBCATEGORIAS = Arrays.asList();
    private final int PRECOINI = 0;
    private final int PRECOFIM = 0;
    private final List<String> AVALIACOES = Arrays.asList();
    private final int NUMREGPAG = 30;
    private final String VISUALIZACAO = "CARD";

    @Test
    public void testNoArgsContructor() {
        MasterSupermercadosRequestProducts masterSupermercadosRequestProducts =
                new MasterSupermercadosRequestProducts();

        masterSupermercadosRequestProducts.setDescricao(DESCRICAO);
        masterSupermercadosRequestProducts.setOrder(ORDER);
        masterSupermercadosRequestProducts.setPg(PG);
        masterSupermercadosRequestProducts.setMarcas(MARCAS);
        masterSupermercadosRequestProducts.setCategorias(CATEGORIAS);
        masterSupermercadosRequestProducts.setSubCategorias(SUBCATEGORIAS);
        masterSupermercadosRequestProducts.setPrecoIni(PRECOINI);
        masterSupermercadosRequestProducts.setPrecoFim(PRECOFIM);
        masterSupermercadosRequestProducts.setAvalicaoes(AVALIACOES);
        masterSupermercadosRequestProducts.setNum_reg_pag(NUMREGPAG);
        masterSupermercadosRequestProducts.setVisualizacao(VISUALIZACAO);

        assertEquals(masterSupermercadosRequestProducts.getDescricao(),DESCRICAO);
        assertEquals(masterSupermercadosRequestProducts.getOrder(),ORDER);
        assertEquals(masterSupermercadosRequestProducts.getPg(),PG);
        assertEquals(masterSupermercadosRequestProducts.getMarcas(),MARCAS);
        assertEquals(masterSupermercadosRequestProducts.getCategorias(),CATEGORIAS);
        assertEquals(masterSupermercadosRequestProducts.getSubCategorias(),SUBCATEGORIAS);
        assertEquals(masterSupermercadosRequestProducts.getPrecoIni(),PRECOINI);
        assertEquals(masterSupermercadosRequestProducts.getPrecoFim(),PRECOFIM);
        assertEquals(masterSupermercadosRequestProducts.getAvalicaoes(),AVALIACOES);
        assertEquals(masterSupermercadosRequestProducts.getNum_reg_pag(),NUMREGPAG);
        assertEquals(masterSupermercadosRequestProducts.getVisualizacao(),VISUALIZACAO);

    }
}