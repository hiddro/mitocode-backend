package com.mitocode.model;

import com.mitocode.enums.OrderStatus;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items; // = new ArrayList<>();

    public void addItem(OrderItem item){
        items.add(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem orderItem : items){
            sum += orderItem.getPrice() * orderItem.getQuantity();
        }

        return sum;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

       sb.append("Order moment: ");
       sb.append(moment).append("\n");
       sb.append("Order Status: ");
       sb.append(status).append("\n");
       sb.append(client).append("\n");
       sb.append("Order Items: \n");

       for(OrderItem oi : items){
            sb.append(oi).append("\n");
       }


        sb.append("Total Price: \n");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
