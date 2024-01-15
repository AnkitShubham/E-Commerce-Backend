package dev.project.ecommerce.services;

import dev.project.ecommerce.dao.ProductDao;
import dev.project.ecommerce.entities.Product;
import dev.project.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServices implements ProductRepository {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }


    @Override
    public Optional<Product> getProductById(long productId) {
        return productDao.findById(productId);
    }

    @Override
    public Product addProduct(Product product){
        productDao.save(product);
        return product;
    }

    @Override
    public List<Product> getProductsByCategory(String category){
        return this.productDao.findProductByCategory(category);
    }
}
