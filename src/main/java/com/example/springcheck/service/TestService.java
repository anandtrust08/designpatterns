package com.example.springcheck.service;

import com.example.springcheck.factory.impl.CreateProductFactory;
import com.example.springcheck.model.Iproduct;
import com.example.springcheck.model.impl.ProductA;
import com.example.springcheck.model.impl.ProductB;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class TestService {
    private final ProductA productA;
    private final ProductB productB;

    public TestService(ProductA productA, ProductB productB) {
        this.productA = productA;
        this.productB = productB;
    }

    public Iproduct getProduct(String productName) {
        CreateProductFactory c = new CreateProductFactory();
        return c.createProduct(productName);
    }


}
