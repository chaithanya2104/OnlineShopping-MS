package com.example.Sales.service;

import com.example.Sales.model.OrderLineItem;
import com.example.Sales.model.SalesOrder;
import com.example.Sales.repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

//    @Autowired
    private OrderLineItem orderLineItem;


    //1. Create/Add Order [i/p= desc, date, email ,listOfItems][o/p = orderId]
    public Long addOrder(SalesOrder order){
        System.out.println("addOrder");
//        SalesOrder createdOrder = new SalesOrder(date,email,description,price);
        SalesOrder Order=salesOrderRepository.save(order);
       return Order.getId();
//        return null;
    }

    //2. Get Order by emailId [i/p= emailId][o/p = orders in SalesOrder, OrderLineItem by OrderId]

    public SalesOrder getOrderByEmail(String email){
        Optional<SalesOrder> foundOrders = salesOrderRepository.findByEmail(email);
        if (foundOrders.isPresent()) {
            return foundOrders.get();
        }
        else{
            return null;
        }
    }

}
