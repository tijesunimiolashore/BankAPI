package com.oyara.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsRepository, long> {
}
