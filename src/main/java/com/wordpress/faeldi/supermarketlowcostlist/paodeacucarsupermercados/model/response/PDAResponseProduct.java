package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PDAResponseProduct {

    @JsonProperty("id")
    private int id;

    @JsonProperty("price")
    private String price;
}