package com.example.factorymethodpattern.factory;

import com.example.factorymethodpattern.model.Iproduct;

public interface IProductGeneratorFactory {
    Iproduct createProduct(String productName);
}
