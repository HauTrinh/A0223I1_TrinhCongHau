package com.codegym.bai3_upload.service;

import com.codegym.bai3_upload.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
