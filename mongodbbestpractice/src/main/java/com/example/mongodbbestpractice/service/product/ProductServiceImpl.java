package com.example.mongodbbestpractice.service.product;
import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findByProductId(String id) {
        return productRepository.findById(id);
    }
    @Override
    public Product saveProduct(Product product) {

        //logica here

        return productRepository.insert(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(String id) {
        productRepository.deleteById(id);
    }


}
