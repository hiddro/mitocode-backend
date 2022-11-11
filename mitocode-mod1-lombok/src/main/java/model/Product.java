package model;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true) // solo los que tengan el tag include aparecerean
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Product {

    @ToString.Include
    @EqualsAndHashCode.Include
    private int idProduct;

//    @ToString.Include
//    @EqualsAndHashCode.Exclude
    private String name;

    //    @ToString.Exclude
//    @EqualsAndHashCode.Exclude
    private double price;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Product product = (Product) o;
//        return idProduct == product.idProduct && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(idProduct, name, price);
//    }
}
