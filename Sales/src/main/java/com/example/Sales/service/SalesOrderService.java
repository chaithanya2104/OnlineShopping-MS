package com.example.Sales.service;

import com.example.Sales.model.OrderLineItem;
import com.example.Sales.model.SalesOrder;
import com.example.Sales.repository.SalesOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class SalesOrderService {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @Autowired
    private OrderLineItem orderLineItem;


    //1. Create/Add Order [i/p= desc, date, email ,listOfItems][o/p = orderId]
    public Long addOrder(SalesOrder order){
        salesOrderRepository.save(order);
        return order.getId();
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
