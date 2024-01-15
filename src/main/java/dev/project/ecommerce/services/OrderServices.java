package dev.project.ecommerce.services;

import dev.project.ecommerce.dao.OrderDao;
import dev.project.ecommerce.entities.Order;
import dev.project.ecommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServices implements OrderRepository {

    @Autowired
    private OrderDao orderDao;
    public Order createOrderForUser(Order order){
        return this.orderDao.save(order);
    }

    public List<Order> getUserOrders(String userId){
        return this.orderDao.findOrderByUserId(userId);
    }
}
