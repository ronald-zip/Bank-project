package com.ronald.bankingbusiness.service;

import com.ronald.bankingbusiness.model.document.Passive;
import com.ronald.bankingbusiness.model.repository.PassiveRepository;
import com.ronald.bankingbusiness.model.service.PassiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PassiveServiceImplements implements PassiveService
{
    @Autowired
    private PassiveRepository passiveRepository;

    @Override
    public Flux<Passive> getAllAccounts()
    {
        return this.passiveRepository.findAll();
    }

    @Override
    public Mono<Passive> saveAccount(Passive passive)
    {
        return this.passiveRepository.save(passive);
    }

    @Override
    public Mono<Passive> findByNumberAccount(String numberAccount)
    {
        return this.passiveRepository.findById(numberAccount);
    }

    @Override
    public Mono<Boolean> existsByNumberAccount(String numberAccount)
    {
        return this.passiveRepository.existsById(numberAccount);
    }

    @Override
    public Mono<Void> delete(String numberAccount)
    {
        return this.passiveRepository.deleteById(numberAccount);
    }

}

