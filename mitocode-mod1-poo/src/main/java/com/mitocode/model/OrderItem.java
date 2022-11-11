package com.mitocode.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderItem {
    private int quantity;
    private double price;
    private Product product;
}
