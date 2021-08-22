package com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordpress.faeldi.supermarketlowcostlist.mastersupermercados.model.MSProduct;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MSListOfProducts implements Serializable {

    @JsonProperty("Produtos")
    private ArrayList<MSProduct> produtos;
}
