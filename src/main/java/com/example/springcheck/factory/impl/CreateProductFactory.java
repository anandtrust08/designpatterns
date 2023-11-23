package com.example.springcheck.factory.impl;

import com.example.springcheck.factory.IProductGeneratorFactory;
import com.example.springcheck.model.Iproduct;
import com.example.springcheck.model.impl.ProductA;
import com.example.springcheck.model.impl.ProductB;

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
