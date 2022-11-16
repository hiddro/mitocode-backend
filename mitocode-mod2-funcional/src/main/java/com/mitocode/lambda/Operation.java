package com.mitocode.lambda;

//interfaz funcional es aquella que tiene 1 solo metodo
@FunctionalInterface
public interface Operation {

    //solo metodos abstractos que no tiene llave, los implementados tienen llave
    int operation(int x, int y);


    //metodos implementados
//    default void m1(){
//
//    }
//
//    static void m2(){
//
//    }
}
