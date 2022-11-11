package com.mitocode.service;

import com.mitocode.model.Product;

public class HelpService {

    public void help(Product product){
        System.out.println("help to product: " + product.getName());
    }
}
