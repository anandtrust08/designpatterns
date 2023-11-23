package com.example.factorymethodpattern.config;

import com.example.factorymethodpattern.model.impl.ProductA;
import com.example.factorymethodpattern.model.impl.ProductB;
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
