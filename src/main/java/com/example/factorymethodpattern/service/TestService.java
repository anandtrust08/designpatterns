package com.example.factorymethodpattern.service;

import com.example.factorymethodpattern.factory.impl.CreateProductFactory;
import com.example.factorymethodpattern.model.Iproduct;
import com.example.factorymethodpattern.model.impl.ProductA;
import com.example.factorymethodpattern.model.impl.ProductB;
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
