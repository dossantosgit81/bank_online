package com.estudosms.bancoonline.service.impl;

import com.estudosms.bancoonline.model.Customer;
import com.estudosms.bancoonline.repository.CustomerRepository;
import com.estudosms.bancoonline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void remove(Long idCustomer) {
        repository.deleteById(idCustomer);
    }

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
}
