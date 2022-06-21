package com.ronald.bankingbusiness.model.repository;

import com.ronald.bankingbusiness.model.document.Client;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<Client, String>
{

}
