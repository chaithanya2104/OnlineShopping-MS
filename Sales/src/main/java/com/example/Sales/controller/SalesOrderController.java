package com.example.Sales.controller;

import com.example.Sales.model.SalesOrder;
import com.example.Sales.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/SalesOrder")
public class SalesOrderController {

    @Autowired
    private SalesOrderService salesOrderService;

    //CreateOrder
    @PostMapping("/CreateOrder")
    public Long createOrder(SalesOrder order){
        return salesOrderService.addOrder(order);
    }

    //GetOrderByEmail
    @GetMapping("/{email}")
    public SalesOrder getOrderByEmail(@PathVariable("email") String email){
        return salesOrderService.getOrderByEmail(email);
    }



}
