package com.wordpress.faeldi.supermarketlowcostlist.exceptions;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Error extends Object{
    private String error;
}
