package com.ronald.bankingbusiness.model.repository;

import com.ronald.bankingbusiness.model.document.Passive;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PassiveRepository extends ReactiveMongoRepository<Passive, String>
{

}
