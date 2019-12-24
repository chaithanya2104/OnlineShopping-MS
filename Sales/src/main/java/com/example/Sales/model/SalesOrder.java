package com.example.Sales.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
@Data
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne(mappedBy = "order_id")
    private Long id;

   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
//    @Email
    private String email;

    private String description;
    private double price;

    public SalesOrder() {
    }

    public SalesOrder(Date date, String email, String description, double price){
        this.date=date;
        this.email=email;
        this.description=description;
        this.price=price;
    }

    @Override
    public String toString() {
        return "sales_order{" +
                "id=" + id +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
