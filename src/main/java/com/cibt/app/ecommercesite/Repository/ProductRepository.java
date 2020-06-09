package com.cibt.app.ecommercesite.Repository;

import com.cibt.app.ecommercesite.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer>{
    
}