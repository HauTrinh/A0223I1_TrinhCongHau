package com.codegym.ss6_th_cust.reposiroty;

import com.codegym.ss6_th_cust.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class CustomerRepository implements ICustomerRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(int id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Customer customer) {
        if (findById(customer.getId()) == null) {
            em.persist(customer);
        } else {
            em.merge(customer);
        }
    }

    @Override
    public void remove(int id) {
        Customer customer = findById(id);
        if (customer != null) {
            em.remove(customer);
        }
    }

    @Override
    public List<Customer> search(String searchName) {
        List<Customer> customerList = findAll();
        List<Customer> searchList = new ArrayList<>();
        for (int i = 0; i < customerList.size(); i++) {
            if(customerList.get(i).getLastName().equalsIgnoreCase(searchName)) {
                searchList.add(customerList.get(i));
            }
        }
        return searchList;
    }
}
