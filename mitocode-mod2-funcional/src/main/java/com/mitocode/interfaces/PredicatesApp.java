package com.mitocode.interfaces;

import java.util.function.Predicate;

public class PredicatesApp {

    private void method1(){
//        int x = 14;
        //predicate solo acepta 1 parametro
        Predicate<Integer> checkAgeNumber = x -> x >= 18; //esta funcion tiene esta logica
        Predicate<Person> checkAge = x -> x.getAge() >= 18;
        boolean result = checkAgeNumber.test(14);
        boolean result2 = checkAge.test(new Person(1, "Mito", 31));

        System.out.println(result);
        System.out.println(result2);
    }

    private void method2(){
        Predicate<Integer> greaterThen = x -> x > 10; // la logica puede ser mas extensa en llave pero debe devolver true o false
        Predicate<Integer> lowerThen = x -> x < 10;

//        boolean rpta = greaterThen.and(lowerThen).test(15);
        boolean rpta = greaterThen.and(lowerThen).negate().test(31); // false negate es true

        System.out.println(rpta);
    }

    private void method3(int num, Predicate<Integer> fx){
        boolean rpta = fx.test(num);
        System.out.println("rpta = " + rpta);
    }

    public static void main(String[] args) {
        PredicatesApp pa = new PredicatesApp();
        Predicate<Integer> pre = x -> x > 5;
//        pa.method3(3, x -> x > 5); //opcion1
        pa.method3(3, pre); // opcion2
    }
}
