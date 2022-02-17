package com.robert.rivera.customer.controller;

import com.robert.rivera.customer.entity.Customer;

import com.robert.rivera.customer.entity.CustomerRequest;
import com.robert.rivera.customer.entity.TransactionResponse;
import com.robert.rivera.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/account")
@RestController
public class CustomerController  {

    @Autowired
    private CustomerService services;
    @GetMapping("/get")
    public List<Customer> getAllClients(){
        return services.getAll();
    }
    @PostMapping("/post")
    @ResponseBody
    public String addCustomer(@RequestBody CustomerRequest customerRequest){
        Customer customer = new Customer(customerRequest);
        if(services.addCustomer(customer) != null) {
            TransactionResponse transactionResponse = new TransactionResponse();
            transactionResponse.setCustomerNumber(customer.getCustomerNumber());
            transactionResponse.setTransactionStatusCode("200");
            transactionResponse.setTransactionStatusDescription("Uploaded Successfully");
            return transactionResponse.toString();
        }
        else{
            TransactionResponse transactionResponse = new TransactionResponse();
            transactionResponse.setTransactionStatusCode("400");
            transactionResponse.setTransactionStatusDescription("Error");
            return transactionResponse.toString();
        }
    }
}
