package com.robert.rivera.customer.services;

import com.robert.rivera.customer.entity.Customer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerService {

    public List<Customer> getAll();

    Customer addCustomer(Customer customer);
}
