package com.mitocode.app;

import com.mitocode.model.Car;
import com.mitocode.model.Mazda;
import com.mitocode.model.Vehicle;

import java.util.*;

public class Program {

    //T = Type | Tipo Clases
    //K = Key
    //V = Value
    //? wildcard -> extends Object

    //Upper-bounded esto es util cuando se define patrones de diseño
    //algo tiene que ser menor que carro
    //? extends Car, solo recibira listas compatibles con tipos de clases que tengan de herencia Car
    void m1(List<? extends Car> list){

    }

    //algo tiene que ser mayor que carro
    void m2(List<? super Car> list){

    }

    public static void main(String[] args) {
        Program p = new Program();
        List<Vehicle> lst = new ArrayList<>();
        p.m2(lst);


//        List<? extends Car> list = new ArrayList<>(); // no recomendado
//        list.add(new Mazda()); // safe type
//
//        List<? super Car> list = new ArrayList<>(); // no recomendado
//        list.add(new Vehicle()); // safe type
    }
}
