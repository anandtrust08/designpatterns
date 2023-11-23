package com.example.factorymethodpattern.factory.impl;

import com.example.factorymethodpattern.factory.IProductGeneratorFactory;
import com.example.factorymethodpattern.model.Iproduct;
import com.example.factorymethodpattern.model.impl.ProductA;
import com.example.factorymethodpattern.model.impl.ProductB;

public class CreateProductFactory implements IProductGeneratorFactory {
    @Override
    public Iproduct createProduct(String iproduct) {
        if("A".equalsIgnoreCase(iproduct))
        return new ProductA();
        if("B".equalsIgnoreCase(iproduct))
            return new ProductB();
        return null;
    }
}
