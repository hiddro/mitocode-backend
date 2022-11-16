package com.mitocode.interfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    private void method1(){

        Consumer<String> print = x -> System.out.println(x); // tienes que retornar un vvoid
        print.accept("Hola Coders");

        List<String> list = List.of("Hola", "Mundo");
        list.forEach(print);
    }

    private void method2(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        Consumer<Integer> consumer = x -> {
            x++;
            System.out.println(x);
        };

        listAll(list, consumer);
    }

    //funcion que recibe otra funcion
    //funciones de alto orden - High Order Functions
    private void listAll(List<Integer> list, Consumer<Integer> fx){
        for (Integer i: list){
            fx.accept(i);
        }
    }

    public static void main(String[] args) {
        ConsumerApp apṕ = new ConsumerApp();
        apṕ.method2();
    }
}
