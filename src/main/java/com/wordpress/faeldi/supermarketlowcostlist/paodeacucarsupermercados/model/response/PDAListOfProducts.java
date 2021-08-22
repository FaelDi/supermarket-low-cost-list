package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.PDAProduct;
import lombok.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class    PDAListOfProducts implements Serializable {

    @JsonProperty("results")
    private List<PDAProduct> results;
}
