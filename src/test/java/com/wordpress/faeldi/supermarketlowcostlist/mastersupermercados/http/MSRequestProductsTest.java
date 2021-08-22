package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http;

import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.request.MSRequestProducts;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MSRequestProductsTest {

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
        MSRequestProducts MSRequestProducts =
                new MSRequestProducts();

        MSRequestProducts.setDescricao(DESCRICAO);
        MSRequestProducts.setOrder(ORDER);
        MSRequestProducts.setPg(PG);
        MSRequestProducts.setMarcas(MARCAS);
        MSRequestProducts.setCategorias(CATEGORIAS);
        MSRequestProducts.setSubCategorias(SUBCATEGORIAS);
        MSRequestProducts.setPrecoIni(PRECOINI);
        MSRequestProducts.setPrecoFim(PRECOFIM);
        MSRequestProducts.setAvalicaoes(AVALIACOES);
        MSRequestProducts.setNum_reg_pag(NUMREGPAG);
        MSRequestProducts.setVisualizacao(VISUALIZACAO);

        assertEquals(MSRequestProducts.getDescricao(),DESCRICAO);
        assertEquals(MSRequestProducts.getOrder(),ORDER);
        assertEquals(MSRequestProducts.getPg(),PG);
        assertEquals(MSRequestProducts.getMarcas(),MARCAS);
        assertEquals(MSRequestProducts.getCategorias(),CATEGORIAS);
        assertEquals(MSRequestProducts.getSubCategorias(),SUBCATEGORIAS);
        assertEquals(MSRequestProducts.getPrecoIni(),PRECOINI);
        assertEquals(MSRequestProducts.getPrecoFim(),PRECOFIM);
        assertEquals(MSRequestProducts.getAvalicaoes(),AVALIACOES);
        assertEquals(MSRequestProducts.getNum_reg_pag(),NUMREGPAG);
        assertEquals(MSRequestProducts.getVisualizacao(),VISUALIZACAO);

    }
}