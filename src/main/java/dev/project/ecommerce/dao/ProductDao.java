package dev.project.ecommerce.dao;

import dev.project.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {
    List<Product> findProductByCategory(String category);
}
