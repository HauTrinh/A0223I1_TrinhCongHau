package com.codegym.bai2_upfile.service;

import com.codegym.bai2_upfile.model.Product;

import java.util.List;


public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
