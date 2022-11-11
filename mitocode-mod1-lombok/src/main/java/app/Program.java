package app;

import model.Customer;
import model.Product;

public class Program {

    public static void main(String[] args) {
//        Product p = new Product(1, "TV", 99.99);
//        Product p2 = new Product(1, "TV", 99.99);

//        p.setIdProduct(1);
//        p.setName("TV");
//        p.setPrice(99.99);

//        boolean rpta = p.equals(p2);
//        System.out.println(rpta);

//        System.out.println(p);

        Customer c1 = new Customer(1, "Mito", true);
        Customer c2 = Customer.builder()
                .idCustomer(1)
                .name("Code")
                .isActive(true)
                .build();

        Customer.CustomerBuilder cb = Customer.builder().idCustomer(1);
        Customer c3 = Customer.create(1, "mitocode");

        if(3 == 5){
            cb.name("mito");
            cb.isActive(true);
        }else{
            cb.name("code");
            cb.isActive(true);
        }

        cb.build();
//        System.out.println("cb = " + cb);
        System.out.println("c3 = " + c3);
    }
}
