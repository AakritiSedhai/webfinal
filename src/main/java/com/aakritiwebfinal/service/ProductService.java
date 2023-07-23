package com.aakritiwebfinal.service;

import com.aakritiwebfinal.model.Product;
import com.aakritiwebfinal.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){

        return productRepository.findAll();
    }
}
