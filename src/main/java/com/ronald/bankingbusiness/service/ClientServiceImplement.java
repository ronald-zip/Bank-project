package com.ronald.bankingbusiness.service;

import com.ronald.bankingbusiness.model.document.Client;
import com.ronald.bankingbusiness.model.repository.ClientRepository;
import com.ronald.bankingbusiness.model.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImplement implements ClientService
{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Flux<Client> getAll()
    {
        return this.clientRepository.findAll();
    }

    @Override
    public Mono<Client> saveClient(Client client)
    {
        return this.clientRepository.save(client);
    }

    @Override
    public Mono<Client> findByDni(String dni)
    {
        return this.clientRepository.findById(dni);
    }

    @Override
    public Mono<Boolean> existsByDni(String dni)
    {
        return this.clientRepository.existsById(dni);
    }

    @Override
    public Mono<Void> deleteByDni(String dni)
    {
        return this.clientRepository.deleteById(dni);
    }

}
