package com.mitocode.app;

import com.mitocode.enums.OrderStatus;
import com.mitocode.model.Client;
import com.mitocode.model.Order;
import com.mitocode.model.OrderItem;
import com.mitocode.model.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        Product p = new Product();
//        p.setName("Tv");
//        p.setPrice(599.99);
//
//        System.out.println(p);
//
//        Product p2 = new Product("PS5", 1000.00);
//
//        System.out.println(p2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Client Data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("BirthDate: {YYYY-MM-DD}");
        String birthDateString = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateString);

        Client client = Client.builder()
                .name(name)
                .email(email)
                .birthDate(birthDate)
                .build();

        System.out.println("Enter Order Data: ");
        System.out.println("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.nextLine());

        List<OrderItem> list = new ArrayList<>();

        Order order = new Order(LocalDateTime.now(), orderStatus, client, list);

        System.out.println("Hoy many items to this order?");
        int numberOfItems = sc.nextInt();

        for(int i = 1; i<= numberOfItems; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.println("Producdt price: ");
            double productPrice = sc.nextDouble();

            System.out.println("Product quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMARY");
        System.out.println(order);
        sc.close();
    }
}
