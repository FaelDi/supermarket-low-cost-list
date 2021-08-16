package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MasterSupermercadosResponseProducts {

    @JsonProperty("Produtos")
    private ArrayList<MasterSupermercadosProduct> produtos;
}
