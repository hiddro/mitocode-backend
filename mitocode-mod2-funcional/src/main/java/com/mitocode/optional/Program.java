package com.mitocode.optional;

import com.mitocode.function.Employee;

import java.time.LocalDate;
import java.util.Optional;

public class Program {

    public void m1Optional(){
//        Optional<Employee> op = Optional.of(new Employee(1, "Edu", "Developer", LocalDate.of(1991, 1, 1), 1000.00, "TI"));
        Optional<Employee> op = Optional.empty();

//        System.out.println(op.get());
        System.out.println(op.orElse(new Employee()));
    }

    public static void main(String[] args) {
        Program app = new Program();
        app.m1Optional();
    }
}
