package com.example.mongodbbestpractice.controller.product;

import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.service.product.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Product> listProduct() {
        log.info("List product from db");
        return productService.findAll();
    }

/*
    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
    public Product save(@RequestBody Product product){ // postman --> body(json)


        log.info("Save product in db");
        //product.setDateOfBirth(LocalDateTime.now());
        return productService.saveProduct(product);
    }
*/

    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
    public Product save(@RequestBody Product product){ // postman --> body(json)
        log.info("Save product in db");
        //product.setDateOfBirth(LocalDateTime.now());
        return productService.saveProduct(product);
    }



   /*
   @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
   public Product save( Product product){ // research for an error in the output
        log.info("Save product in db");
        return productService.saveProduct(product);
   }*/

    @DeleteMapping(value = "/delete/{id}")
        //@RequestMapping(value = "delete", method = RequestMethod.DELETE)
        // or use @DeleteMapping
    void deleteProductById(@PathVariable String id){
        log.info("delete Product for id ",id);
        productService.deleteProductById(id);
    }
    @PutMapping(value = "/update/{id}")
        //@RequestMapping(value = "update",method = RequestMethod.POST)
    void updateProductById(@PathVariable String id, @RequestBody Product product){
        log.info("Update data for id: ",id);
        productService.updateProduct(product);
    }

}