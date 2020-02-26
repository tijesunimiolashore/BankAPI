package com.oyara.bank.models;

import lombok.Data;

@Data
public class CustomerBalance {
    private String accountNumber;
    private String currency;
    private long availableBalance;
    private long clearedBalance;
    private long unclearedBalance;
    private long holdBalance;
    private long minimumBalance;
}
