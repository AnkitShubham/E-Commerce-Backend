package dev.project.ecommerce.controllers;

import dev.project.ecommerce.entities.Order;
import dev.project.ecommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @PostMapping("/order")
    public Order createOrder(@RequestBody Order order){
        return this.orderRepo.createOrderForUser(order);
    }

    @GetMapping("/orders/{userId}")
    public List<Order> getOrders(@PathVariable String userId){
        return this.orderRepo.getUserOrders(userId);
    }
}
