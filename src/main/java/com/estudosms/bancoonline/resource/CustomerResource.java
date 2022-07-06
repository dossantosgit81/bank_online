package com.estudosms.bancoonline.resource;

import com.estudosms.bancoonline.model.Customer;
import com.estudosms.bancoonline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/customers")
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("{idCustomer}")
    public ResponseEntity<Void> remove(@PathVariable Long idCustomer){
        service.remove(idCustomer);
        return ResponseEntity.ok().build();
    }
}
