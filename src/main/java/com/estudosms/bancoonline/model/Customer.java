package com.estudosms.bancoonline.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Builder
@Entity
@SQLDelete(sql = "UPDATE customer SET deleted = 1 WHERE id_customer = ? ")
@Where(clause="deleted=false")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CUSTOMER")
    private Long idCustomer;

    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="LASTNAME")
    private String lastName;

    @Column(name="CPF")
    private String cpf;

    @Column(name = "DELETED")
    private Boolean deleted = Boolean.FALSE;

    @OneToMany(mappedBy = "customer")
    private List<Account> accounts;

}
