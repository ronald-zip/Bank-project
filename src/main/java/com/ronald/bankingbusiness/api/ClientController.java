package com.ronald.bankingbusiness.api;

import com.ronald.bankingbusiness.model.document.Client;
import com.ronald.bankingbusiness.model.repository.ClientRepository;
import com.ronald.bankingbusiness.model.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/client")
public class ClientController
{
    @Autowired
    private ClientService clientService;

    @PostMapping
    public Mono<Client> registerClient(@RequestBody Client client)
    {
        return clientService.saveClient(client);
    }

    @GetMapping("/{dni}")
    public Mono<Client> findClient(@PathVariable String dni)
    {
        return clientService.findByDni(dni);
    }

    @GetMapping
    public Flux<Client> showClient()
    {
        return clientService.getAll();
    }

    @DeleteMapping("/delete/{dni}")
    public Mono<Void> deleteClient(@PathVariable String dni)
    {
        return clientService.deleteByDni(dni);
    }

    @GetMapping("/find/{dni}")
    public Mono<Boolean> existClient(@PathVariable String dni)
    {
        return clientService.existsByDni(dni);
    }

}
