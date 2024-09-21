package com.Springboot.WebStructure.Services;

import com.Springboot.WebStructure.Entities.Products;
import com.Springboot.WebStructure.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
//    List<Products> pro = new ArrayList<>( Arrays.asList(
//            new Products(2,"Hello",999),
//            new Products(3,"Phone",99)
//            ));
    public List<Products> getProducts(){
        return repo.findAll();
    }

    public Products getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Products());
    }
    public void addProduct( Products prod){
        repo.save(prod);
    }
    public void updateProduct(Products prod){
        repo.save(prod);
    }

    public void deleteProduct(int proId){
        repo.deleteById(proId);
    }



}
