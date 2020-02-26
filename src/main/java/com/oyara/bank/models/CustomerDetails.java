package com.oyara.bank.models;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerDetails {
    private String accountNumber;
    private String accountName;
    private String currency;
    private Date accountOpeningDate;
    private Date lastTransactionDate;
    private String accountType;
    private long bvn;
    private String fullname;
    private long phoneNumber;
    private String email;
    private String status;
}
