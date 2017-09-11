/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmvc.springmongodbweb.repositories;

import com.springmvc.springmongodbweb.models.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author didin
 */
public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    Product findOne(String id);
    
    @Override
    void delete(Product deleted);
}