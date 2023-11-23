package com.example.factorymethodpattern.model.impl;

import com.example.factorymethodpattern.model.Iproduct;

public class ProductA implements Iproduct {

    public String value() {
       return "inside Product A";
    }
}
