package com.wordpress.faeldi.supermarketlowcostlist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SupermarketLowCostListApplication {

	private static  final Logger LOGGER = LoggerFactory.getLogger(SupermarketLowCostListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SupermarketLowCostListApplication.class, args);
	}
}
