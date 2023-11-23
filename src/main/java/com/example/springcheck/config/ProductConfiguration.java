package com.example.springcheck.config;

import com.example.springcheck.model.impl.ProductA;
import com.example.springcheck.model.impl.ProductB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public ProductA createA() {
        return new ProductA();
    }

    @Bean
    public ProductB createB() {
        return new ProductB();
    }
}
