package com.Springboot.WebStructure.Controller;

import com.Springboot.WebStructure.Entities.Products;
import com.Springboot.WebStructure.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/products")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Products getProductsById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Products pro){
        System.out.println(pro);
        service.addProduct(pro);
    }


}
