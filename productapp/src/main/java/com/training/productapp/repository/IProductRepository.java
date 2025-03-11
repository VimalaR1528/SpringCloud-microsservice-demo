package com.training.productapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.productapp.domain.Product;
 

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{

}
