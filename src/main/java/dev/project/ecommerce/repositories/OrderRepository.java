package dev.project.ecommerce.repositories;

import dev.project.ecommerce.entities.Order;

import java.util.List;

public interface OrderRepository {
    public Order createOrderForUser(Order order);

    public List<Order> getUserOrders(String userId);
}
