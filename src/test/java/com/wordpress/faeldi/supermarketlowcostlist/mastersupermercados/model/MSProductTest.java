package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MSProductTest {
             
    private final int id_produto = 5504;
    private final String str_id_integrador = "62042";
    private final String str_nom_produto = "Leite Longa Vida Piá Zero Lactose Semi Desnatado 1l";
    private final String str_link_produto = "5504/leite-longa-vida-pia-zero-lactose-semi-desnatado-1l";
    private final double mny_vlr_produto_de = 4.3900;
    private final double mny_vlr_produto_por = 4.3900;
    private final double mny_perc_desconto = 0.0000;
    private final boolean bit_preco_bloqueado = false;
    private final boolean bit_exibe_de_por_tabela_preco = false;
    private final int int_qtd_parcela = 1;
    private final double mny_vlr_parcela = 4.3900;
    private final String str_nom_marca = "Pia";
    private final boolean bit_selo1 = false;
    private final boolean bit_selo2 = false;
    private final boolean bit_selo3 = false;
    private final boolean bit_selo4 = false;
    private final boolean bit_selo5 = false;
    private final String str_url_selo1 = "https=//master-b2b-img.azureedge.net/general/selo1.png";
    private final String str_url_selo2 = "https=//master-b2b-img.azureedge.net/general/selo2.png";
    private final String str_url_selo3 = "https=//master-b2b-img.azureedge.net/general/selo3.png";
    private final String str_url_selo4 = "https=//master-b2b-img.azureedge.net/general/selo4.png";
    private final String str_url_selo5 = "https=//master-b2b-img.azureedge.net/general/selo5.png";
    private final String str_url_selo_tbpreco = null;
    private final int id_grupo_home = 0;
    private final String str_img_path = "https=//masterstr.blob.core.windows.net/product/16086-leite-pia-zero-lactose-semi-desnatado-1l-m.jpg";
    private final String str_img_path_cdn = "https=//master-b2b-img.azureedge.net/product/16086-leite-pia-zero-lactose-semi-desnatado-1l-m.jpg";
    private final int id_produto_modelo = 5678;
    private final String str_sigla_unidade_medida = "UN";
    private final boolean bit_esgotado = false;
    private final double ult_pag = 3.0;
    private final int int_fator_multiplicador_peso = 100;
    private final double qtdeCesta = 0.0;
    private final boolean estaNaCesta = false;

    @Test
    public void testModelBuilder() {
        MSProduct product =
                MSProduct
                        .builder()
                        .id_produto(id_produto)
                        .str_id_integrador(str_id_integrador)
                        .str_nom_produto(str_nom_produto)
                        .str_link_produto(str_link_produto)
                        .mny_vlr_produto_de(mny_vlr_produto_de)
                        .mny_vlr_produto_por(mny_vlr_produto_por)
                        .mny_perc_desconto(mny_perc_desconto)
                        .bit_preco_bloqueado(bit_preco_bloqueado)
                        .bit_exibe_de_por_tabela_preco(bit_exibe_de_por_tabela_preco)
                        .int_qtd_parcela(int_qtd_parcela)
                        .mny_vlr_parcela(mny_vlr_parcela)
                        .str_nom_marca(str_nom_marca)
                        .bit_selo1(bit_selo1)
                        .bit_selo2(bit_selo2)
                        .bit_selo3(bit_selo3)
                        .bit_selo4(bit_selo4)
                        .bit_selo5(bit_selo5)
                        .str_url_selo1(str_url_selo1)
                        .str_url_selo2(str_url_selo2)
                        .str_url_selo3(str_url_selo3)
                        .str_url_selo4(str_url_selo4)
                        .str_url_selo5(str_url_selo5)
                        .str_url_selo_tbpreco(null)
                        .id_grupo_home(id_grupo_home)
                        .str_img_path(str_img_path)
                        .str_img_path_cdn(str_img_path_cdn)
                        .id_produto_modelo(id_produto_modelo)
                        .str_sigla_unidade_medida(str_sigla_unidade_medida)
                        .bit_esgotado(bit_esgotado)
                        .ult_pag(ult_pag)
                        .int_fator_multiplicador_peso(int_fator_multiplicador_peso)
                        .qtdeCesta(qtdeCesta)
                        .estaNaCesta(estaNaCesta)
                        .build();

                    assertEquals(id_produto,product.getId_produto());
                    assertEquals(str_id_integrador,product.getStr_id_integrador());
                    assertEquals(str_nom_produto,product.getStr_nom_produto());
                    assertEquals(str_link_produto,product.getStr_link_produto());
                    assertEquals(mny_vlr_produto_de,product.getMny_vlr_produto_de());
                    assertEquals(mny_vlr_produto_por,product.getMny_vlr_produto_por());
                    assertEquals(mny_perc_desconto,product.getMny_perc_desconto());
                    assertEquals(bit_preco_bloqueado,product.isBit_preco_bloqueado());
                    assertEquals(bit_exibe_de_por_tabela_preco,product.isBit_exibe_de_por_tabela_preco());
                    assertEquals(int_qtd_parcela,product.getInt_qtd_parcela());
                    assertEquals(mny_vlr_parcela,product.getMny_vlr_parcela());
                    assertEquals(str_nom_marca,product.getStr_nom_marca());
                    assertEquals(bit_selo1,product.isBit_selo1());
                    assertEquals(bit_selo2,product.isBit_selo2());
                    assertEquals(bit_selo3,product.isBit_selo3());
                    assertEquals(bit_selo4,product.isBit_selo4());
                    assertEquals(bit_selo5,product.isBit_selo5());
                    assertEquals(str_url_selo1,product.getStr_url_selo1());
                    assertEquals(str_url_selo2,product.getStr_url_selo2());
                    assertEquals(str_url_selo3,product.getStr_url_selo3());
                    assertEquals(str_url_selo4,product.getStr_url_selo4());
                    assertEquals(str_url_selo5,product.getStr_url_selo5());
                    assertEquals(str_url_selo_tbpreco,product.getStr_url_selo_tbpreco());
                    assertEquals(id_grupo_home,product.getId_grupo_home());
                    assertEquals(str_img_path,product.getStr_img_path());
                    assertEquals(str_img_path_cdn,product.getStr_img_path_cdn());
                    assertEquals(id_produto_modelo,product.getId_produto_modelo());
                    assertEquals(str_sigla_unidade_medida,product.getStr_sigla_unidade_medida());
                    assertEquals(bit_esgotado,product.isBit_esgotado());
                    assertEquals(ult_pag,product.getUlt_pag());
                    assertEquals(int_fator_multiplicador_peso,product.getInt_fator_multiplicador_peso());
                    assertEquals(qtdeCesta,product.getQtdeCesta());
                    assertEquals(estaNaCesta,product.isEstaNaCesta());
    }
}