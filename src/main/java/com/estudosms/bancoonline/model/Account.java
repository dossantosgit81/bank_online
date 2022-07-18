package com.estudosms.bancoonline.model;

import com.estudosms.bancoonline.model.enums.AccountType;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@Entity
@SQLDelete(sql = "UPDATE account SET deleted = 1 WHERE id_account = ? ")
@Where(clause="deleted=false")
@AllArgsConstructor
@NoArgsConstructor
public class Account {
//Tipo da conta(CPF, CNPJ), dados bancarios(banco, agência, conta)
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_ACCOUNT")
    private Long idAccount;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private BigDecimal balance = BigDecimal.ZERO;

    @Column(name="NUMBER_ACCOUNT")
    private Integer number;

    private Boolean deleted = Boolean.FALSE;

    @ManyToOne
    private Customer customer;

}
