package dev.project.ecommerce.controllers;

import dev.project.ecommerce.entities.Product;
import dev.project.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductRepository proRepo;

    //Add a product to database
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return this.proRepo.addProduct(product);
    }

    //Get all products
    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.proRepo.getAllProducts();
    }

    //Get a particular product by passing product id
    @GetMapping("/product/{productId}")
    public Optional<Product> getProductById(@PathVariable long productId){
        return  this.proRepo.getProductById(productId);
    }

    //Get products of a particular category
    @GetMapping("/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return this.proRepo.getProductsByCategory(category);
    }

}
