package com.estudosms.bancoonline.service;

import com.estudosms.bancoonline.model.Customer;

import java.util.List;

public interface CustomerService {

    void remove(Long idCustomer);

    List<Customer> findAll();
}
