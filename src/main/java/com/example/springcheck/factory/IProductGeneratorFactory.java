package com.example.springcheck.factory;

import com.example.springcheck.model.Iproduct;

public interface IProductGeneratorFactory {
    Iproduct createProduct(String productName);
}
