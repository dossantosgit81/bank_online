package com.estudosms.bancoonline.repository;

import com.estudosms.bancoonline.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
