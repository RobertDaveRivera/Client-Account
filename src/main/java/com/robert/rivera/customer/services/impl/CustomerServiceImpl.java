package com.robert.rivera.customer.services.impl;

import com.robert.rivera.customer.entity.Customer;
import com.robert.rivera.customer.repository.CustomerRepository;
import com.robert.rivera.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repo;
    @Override
    public List<Customer> getAll() {
        return repo.findAll();
    }
    @Override
    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }
}
