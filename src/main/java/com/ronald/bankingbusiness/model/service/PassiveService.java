package com.ronald.bankingbusiness.model.service;

import com.ronald.bankingbusiness.model.document.Passive;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PassiveService
{
    Flux<Passive> getAllAccounts();
    Mono<Passive> saveAccount(Passive passive);
    Mono<Passive> findByNumberAccount(String numberAccount);
    Mono<Boolean> existsByNumberAccount(String numberAccount);
    Mono<Void> delete(String numberAccount);
}
