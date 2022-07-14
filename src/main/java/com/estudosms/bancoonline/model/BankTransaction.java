package com.estudosms.bancoonline.model;

import com.estudosms.bancoonline.model.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTransaction;

    @Column(name = "DATE_TRANSACTION")
    private LocalDateTime dateTransaction;

    @Column(name = "TRANSACTION_TYPE")
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @JoinColumn(name = "RF_ACCOUNT_SPONSOR")
    @OneToOne
    private Account accountsSponsor;

    @JoinColumn(name = "RF_ACCOUNT_DESTINY")
    @OneToOne
    private Account accountDestiny;

    @Column(name = "AMOUNT_SENT")
    private BigDecimal amountSent;
}
