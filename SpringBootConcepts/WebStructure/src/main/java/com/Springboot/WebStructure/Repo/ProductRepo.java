package com.Springboot.WebStructure.Repo;


import com.Springboot.WebStructure.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products , Integer> {

}
