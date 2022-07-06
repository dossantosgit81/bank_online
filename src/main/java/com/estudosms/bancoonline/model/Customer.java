package com.estudosms.bancoonline.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@Entity
@SQLDelete(sql = "UPDATE customer SET deleted = true WHERE = idCustomer=? ")
@Where(clause="deleted=false")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;

    private String firstName;

    private String lastName;

    private String cpf;

    private Boolean deleted = Boolean.FALSE;

}
