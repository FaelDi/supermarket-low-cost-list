package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PDAResponsePrice {

    @JsonProperty("content")
    private List<PDAResponseProduct> content;
}
