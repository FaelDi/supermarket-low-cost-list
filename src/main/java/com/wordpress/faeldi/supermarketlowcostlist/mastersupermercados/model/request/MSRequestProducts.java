package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class MSRequestProducts implements Serializable {

    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("order")
    private String order;
    @JsonProperty("pg")
    private int pg;
    @JsonProperty("marcas")
    private List<String> marcas;
    @JsonProperty("categorias")
    private List<String> categorias;
    @JsonProperty("subcategorias")
    private List<String> subCategorias;
    @JsonProperty("precoIni")
    private int precoIni;
    @JsonProperty("precoFim")
    private int precoFim;
    @JsonProperty("avaliacoes")
    private List<String> avalicaoes;
    @JsonProperty("num_reg_pag")
    private int num_reg_pag;
    @JsonProperty("visualizacao")
    private String visualizacao;
}


