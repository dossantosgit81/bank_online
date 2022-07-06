package com.estudosms.bancoonline.resource;

import com.estudosms.bancoonline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/customers")
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @DeleteMapping("{idCustomer}")
    public ResponseEntity<Void> remove(@PathVariable Long idCustomer){

        return ResponseEntity.ok().build();
    }
}
