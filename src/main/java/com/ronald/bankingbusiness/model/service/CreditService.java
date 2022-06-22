package com.ronald.bankingbusiness.model.service;

import com.ronald.bankingbusiness.model.document.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService
{
    Flux<Credit> getAllCredits();
    Mono<Credit> saveCredit(Credit credit );
    Mono<Credit> findByNumberCredit(String numberAccount);
    Mono<Boolean> existsByNumberCredit(String numberAccount);
    Mono<Void> delete(String numberAccount);
}
