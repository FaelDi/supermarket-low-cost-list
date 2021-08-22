package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model;

import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MSProduct {

    private int id_produto;
    private String str_id_integrador;
    private String str_nom_produto;
    private String str_link_produto;
    private Double mny_vlr_produto_de;
    private Double mny_vlr_produto_por;
    private Double mny_perc_desconto;
    private boolean bit_preco_bloqueado;
    private boolean bit_exibe_de_por_tabela_preco;
    private int int_qtd_parcela;
    private Double mny_vlr_parcela;
    private String str_nom_marca;
    private boolean bit_selo1;
    private boolean bit_selo2;
    private boolean bit_selo3;
    private boolean bit_selo4;
    private boolean bit_selo5;
    private String str_url_selo1;
    private String str_url_selo2;
    private String str_url_selo3;
    private String str_url_selo4;
    private String str_url_selo5;
    private String str_url_selo_tbpreco;
    private int id_grupo_home;
    private String str_img_path;
    private String str_img_path_cdn;
    private int id_produto_modelo;
    private String str_sigla_unidade_medida;
    private boolean bit_esgotado;
    private Double ult_pag;
    private int int_fator_multiplicador_peso;
    private Double qtdeCesta;
    private boolean estaNaCesta;

}
