package com.example.Sales.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;

@Entity
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @OneToOne(mappedBy = "order_id")
    private Long id;

    @DateTimeFormat(pattern = "mm/dd/yyyy")
    private Date date;
    @Email
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

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
