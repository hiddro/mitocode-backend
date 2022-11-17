package com.mitocode.cursofuncional;

import com.mitocode.cursofuncional.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona(1, "edu", "cordova", "M"));
        lista.add(new Persona(2, "cris", "fuentes", "F"));
        lista.add(new Persona(3, "laia", "cordova", "F"));
        lista.add(new Persona(4, "norma", "chavez", "F"));
        lista.add(new Persona(5, "edward", "carbajal", "M"));

        // toSet no repite datos toList si lo repite
//        lista.stream()
//                .map(persona -> persona.getName())
//                .mapToInt(String::length)
//                .forEach(System.out::println);}

        boolean match = lista.stream()
                .noneMatch(persona -> "F".equals(persona.getGenero()));
//                .anyMatch(persona -> "F".equals(persona.getGenero()));
//                .allMatch(persona -> "F".equals(persona.getGenero()));
        System.out.println("match = " + match);



//        ReportPersona report = new ReportPersona();
//        report.setLista(lista);

//        System.out.println(report.getLista());
//        report.getLista().forEach(c -> {
//            if(c.getGenero().equals("M")){
//                System.out.println(c.getName() + " Soy Hombre");
//            }else{
//                System.out.println(c.getName() + " Soy Mujer");
//            }
//        });

//        List<Persona> newlista = report.getLista().stream().filter(c -> {
//            return c.getGenero().equals("M");
//        }).collect(Collectors.toList());
//        System.out.println(newlista);


    }
}
