package dev.project.ecommerce.dao;

import dev.project.ecommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderDao extends JpaRepository<Order, String> {
    List<Order> findOrderByUserId(String userId);
}
