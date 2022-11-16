package com.mitocode.function;

import com.mitocode.interfaces.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApp {
    private void m1Apply(){
        Function<String, Integer> fx = x -> x.length(); //entrada string salida integer
        Integer rpta = fx.apply("mitocode");
        System.out.println("rpta = " + rpta);
    }

    private void m2AndThen(){
        Function<String, Integer> fx1 = x -> x.length();
        Function<Integer, Integer> fx2 = x -> x + 10;

        Integer rpta = fx1.andThen(fx2).apply("mitocode");
        System.out.println("rpta = " + rpta);
    }

    private void m3AndThen2(){
        Function<Integer, Integer> fx1 = x -> x * 2;
        Function<Integer, Integer> fx2 = x -> x + 10;

        Integer rpta = fx1.andThen(fx2).apply(5);
        System.out.println("rpta = " + rpta);
    }

    private void m4Compose(){
        Function<Integer, Integer> fx1 = x -> x * 2;
        Function<Integer, Integer> fx2 = x -> x + 10;

        Integer rpta = fx1.compose(fx2).apply(5);
        System.out.println("rpta = " + rpta);
    }

    private void m5Identity(){
        //f(x) = x
        Function<Employee, Employee> fx = Function.identity();
        System.out.println(fx.apply(new Employee(1, "Edu", "Programmer", LocalDate.now(), 1000.0, "Dev")));
    }

    private void m6Identity(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Edu", 31));
        personList.add(new Person(2, "Cris", 32));
        personList.add(new Person(3, "Laia", 33));

//        Map<Integer, Person> map = new HashMap<>();
//        map.put(0, personList.get(0));
//        map.put(1, personList.get(1));

        Map<Integer, Person> map = personList.stream()
                .collect(Collectors.toMap(Person::getId, Function.identity())); // e -> e.getId() a Person::getId / e -> e  es Function.identity

        System.out.println("map = " + map);
    }

    private void m7Identity(){
        Function<Integer, Integer> f1 = Function.identity(); // referencia aclases sale lo mismo
        Function<Integer, Integer> f2 = Function.identity();
        Function<Integer, Integer> f3 = Function.identity();

        Function<Integer, Integer> f4 = t -> t; // instancias  diferente espacio de memoria
        Function<Integer, Integer> f5 = t -> t;
        Function<Integer, Integer> f6 = t -> t;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("================");
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
    }

    public static void main(String[] args) {
        FunctionApp fap = new FunctionApp();
        fap.m7Identity();
    }
}
