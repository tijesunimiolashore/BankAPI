package com.oyara.bank.api;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path= "/api/v1/bank")
public class BankApi {
    //credit

    @PostMapping(path = "/credit")
    public RequestEntity<?> credit(){
        return new RequestEntity<>();
    }
    //debit
    @PostMapping(path = "/debit")
    public RequestEntity<?> debit(){
        return new RequestEntity<>();
    }
    //freeze
    @PostMapping(path = "/freee")
    public RequestEntity<?> freeze(){
        return new RequestEntity<>();
    }
}
