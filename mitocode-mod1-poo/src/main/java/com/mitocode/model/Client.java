package com.mitocode.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
}
