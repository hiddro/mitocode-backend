package com.mitocode.function;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

    @EqualsAndHashCode.Include
    private Integer idEmployee;
    private String name;
    private String job;
    private LocalDate birthDate;
    private double salary;
    private String department;
}
