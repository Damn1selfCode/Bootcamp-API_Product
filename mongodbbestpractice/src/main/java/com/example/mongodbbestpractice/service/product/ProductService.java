package com.example.mongodbbestpractice.service.product;


import com.example.mongodbbestpractice.model.product.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findByProductId(String id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProductById(String id);
}


