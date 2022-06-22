package com.ronald.bankingbusiness.model.repository;

import com.ronald.bankingbusiness.model.document.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String>
{

}

