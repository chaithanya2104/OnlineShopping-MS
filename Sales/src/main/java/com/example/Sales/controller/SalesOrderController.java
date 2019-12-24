package com.example.Sales.controller;

import com.example.Sales.model.SalesOrder;
import com.example.Sales.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SalesOrder")
public class SalesOrderController {

    @Autowired
    private SalesOrderService salesOrderService;

    public SalesOrderController(){
        System.out.println("Reached sales order");
    }
    //System.out.println("Reached sales order");

    //CreateOrder
    @PostMapping("/CreateOrder")
    public Long createOrder(@RequestBody SalesOrder order)
    {
        System.out.println("create order");
        System.out.println(order);
        System.out.println(order.getDate()+order.getEmail()+order.getDescription()+order.getPrice());

        Long id= salesOrderService.addOrder(order);
        //return salesOrderService.addOrder(order);
       return id;

    }

    //GetOrderByEmail
    @GetMapping("/{email}")
    public SalesOrder getOrderByEmail(@PathVariable("email") String email){
//        return salesOrderService.getOrderByEmail(email);
        return null;
    }



}
