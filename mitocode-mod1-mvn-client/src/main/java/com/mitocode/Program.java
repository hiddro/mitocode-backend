package com.mitocode;

import com.mitocode.model.Product;
import com.mitocode.service.HelpService;

public class Program {
    public static void main(String[] args) {
        HelpService helpService = new HelpService();
        helpService.toHelp(new Product(1, "TV"));
    }
}
