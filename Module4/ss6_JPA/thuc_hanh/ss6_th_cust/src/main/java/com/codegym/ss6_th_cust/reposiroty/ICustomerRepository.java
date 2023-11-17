package com.codegym.ss6_th_cust.reposiroty;

import com.codegym.ss6_th_cust.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
    List<Customer> search(String searchName);
}
