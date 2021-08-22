package com.wordpress.faeldi.supermarketlowcostlist.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import java.time.Duration;
import static com.wordpress.faeldi.supermarketlowcostlist.utils.CommonConstants.FIVE_HUNDRED;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.setConnectTimeout(Duration.ofSeconds(FIVE_HUNDRED)).setReadTimeout(Duration.ofSeconds(FIVE_HUNDRED)).build();
    }

}
