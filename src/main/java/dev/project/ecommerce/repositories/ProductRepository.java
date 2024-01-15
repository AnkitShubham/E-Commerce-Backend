package dev.project.ecommerce.repositories;

import dev.project.ecommerce.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Product addProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(long productId);
    List<Product> getProductsByCategory(String category);
}
