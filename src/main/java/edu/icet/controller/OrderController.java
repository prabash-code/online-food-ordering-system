package edu.icet.controller;

import edu.icet.model.dto.Order;
import edu.icet.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping
    public void saveOrder(@RequestBody Order order){
        orderService.orderSave(order);

    }
    @GetMapping("/{id}")
    public Order viewOrders(@PathVariable Long id){
        return orderService.viewOrders(id);

    }
}
