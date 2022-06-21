package com.ronald.bankingbusiness.api;

import com.ronald.bankingbusiness.model.document.Client;
import com.ronald.bankingbusiness.model.repository.ClientRepository;
import com.ronald.bankingbusiness.model.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/accounts")
public class ClientController
{
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Mono<Client> register(@RequestBody Client client)
    {
        return clientService.save(client);
    }
}
