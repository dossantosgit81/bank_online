CREATE TABLE BANK_TRANSACTION(
    ID_TRANSACTION BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    DATE_TRANSACTION TIMESTAMP NOT NULL,
    TRANSACTION_TYPE VARCHAR(20) NOT NULL,
    RF_ACCOUNT BIGINT(20) NOT NULL,
    FOREIGN KEY (RF_ACCOUNT) REFERENCES ACCOUNT(ID_ACCOUNT)
)ENGINE InnoDB DEFAULT CHARSET=UTF8;