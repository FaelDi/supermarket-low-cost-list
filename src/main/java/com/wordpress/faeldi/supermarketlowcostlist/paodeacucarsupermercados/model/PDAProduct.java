package com.wordpress.faeldi.supermarketlowcostlist.paodeacucarsupermercados.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class PDAProduct implements Serializable {

    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("text")
    private String text;
    @JsonProperty("rank")
    private int rank;
    @JsonProperty("s_id")
    private int s_id;
    @JsonProperty("image_url")
    private String image_url;
    @JsonProperty("price")
    private String price;
    @JsonProperty("instock")
    private String instock;
    @JsonProperty("shelfname")
    private String shelfname;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("mainShelfId")
    private String mainShelfId;
    @JsonProperty("brand")
    private String brand;

}
