package com.mitocode.interfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierApp {
    private void method1(){
        Supplier<LocalDateTime> fx = () -> LocalDateTime.now().minusDays(2);

        System.out.println(fx.get());
    }

    public static void main(String[] args) {
        SupplierApp sp = new SupplierApp();
        sp.method1();
    }
}
