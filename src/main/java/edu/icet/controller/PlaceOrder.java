package edu.icet.controller;

import edu.icet.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/placeOrder")

public class PlaceOrder {
    @Autowired
    PlaceOrderService placeOrderService;

    @PostMapping
    public void createOrder(@RequestBody PlaceOrder placeOrder){
        placeOrderService.placeNewOrder(placeOrder);


    }

}
