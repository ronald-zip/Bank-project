package com.ronald.bankingbusiness.service;

import com.ronald.bankingbusiness.model.document.Credit;
import com.ronald.bankingbusiness.model.document.Passive;
import com.ronald.bankingbusiness.model.repository.CreditRepository;
import com.ronald.bankingbusiness.model.repository.PassiveRepository;
import com.ronald.bankingbusiness.model.service.CreditService;
import com.ronald.bankingbusiness.model.service.PassiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditServiceImplement implements CreditService
{
    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Flux<Credit> getAllCredits()
    {
        return this.creditRepository.findAll();
    }

    @Override
    public Mono<Credit> saveCredit(Credit credit)
    {
        return this.creditRepository.save(credit);
    }

    @Override
    public Mono<Credit> findByNumberCredit(String numberAccount)
    {
        return this.creditRepository.findById(numberAccount);
    }

    @Override
    public Mono<Boolean> existsByNumberCredit(String numberAccount)
    {
        return this.creditRepository.existsById(numberAccount);
    }

    @Override
    public Mono<Void> delete(String numberAccount)
    {
        return this.creditRepository.deleteById(numberAccount);
    }

}
