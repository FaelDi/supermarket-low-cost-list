package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.http;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MasterSupermercadosProduct;
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
