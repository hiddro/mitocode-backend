package com.mitocode.app;

import com.mitocode.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Employee e1 = new Employee(1, "Edu", 1000.00);
        Employee e2 = new Employee(2, "Cris", 2000.00);

        //primera forma
        list.add(e1);
        list.add(e2);

        //segunda forma
        List<Employee> list2 = Arrays.asList(e1, e2);

        //tercera forma
        List<Employee> list3 = new ArrayList<>(); //10 por defecto initialcapacity

        List<Employee> list4 = new ArrayList<>();

        list4.add(new Employee(1, "Edu", 20.00));
        list4.add(new Employee(2, "Mito", 25.00));
        list4.add(new Employee(3, "Code", 30.00));

//        Collections.reverse(list4); // del ultimo al primero
        Collections.shuffle(list4); // ramdon

//        System.out.println(list4);

        //tipico de java <= version 7 menor e igual
//        for (int i = 0; i < list4.size(); i++){
//            System.out.println(list4.get(i));
//        }

//        for (Employee e: list4){
//            System.out.println(e);
//        }

        list4.forEach(System.out::println); //x -> System.out.println(x)

    }
}
