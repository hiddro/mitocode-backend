package model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Builder
public class Customer {

    @EqualsAndHashCode.Include
    private int idCustomer;
    private String name;
    private boolean isActive;

    @Builder
    public static Customer create(int idCustomer, String name){
        return new Customer(idCustomer, name, true);
    }
}
