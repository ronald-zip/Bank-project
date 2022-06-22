package com.ronald.bankingbusiness.model.service;

import com.ronald.bankingbusiness.model.document.Client;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService
{
    Flux<Client> getAll();
    Mono<Client> saveClient(Client client);
    Mono<Client> findByDni(String dni);
    Mono<Boolean> existsByDni(String dni);
    Mono<Void> deleteByDni(String dni);
}
