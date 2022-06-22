package com.ronald.bankingbusiness.api;

import com.ronald.bankingbusiness.model.document.Client;
import com.ronald.bankingbusiness.model.document.Credit;
import com.ronald.bankingbusiness.model.service.ClientService;
import com.ronald.bankingbusiness.model.service.CreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.invoke.MethodHandles;

@RestController
@RequestMapping("/credit")
public class CreditController
{

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Autowired
    private CreditService creditService;

    @PostMapping
    public Mono<Credit> registerClient(@RequestBody Credit credit)
    {
        LOGGER.info("Registra la cuenta de credito");
        return creditService.saveCredit(credit);
    }

    @GetMapping("/{dni}")
    public Mono<Credit> findCredit(@PathVariable String account)
    {
        LOGGER.info("Obtener todas la cuenta de credito");
        return creditService.findByNumberCredit(account);
    }

    @GetMapping
    public Flux<Credit> showCredits()
    {
        LOGGER.info("Muestra todas las cuentas de credito");
        return creditService.getAllCredits();
    }

    @DeleteMapping("/{account}")
    public Mono<Void> deleteClient(@PathVariable String account)
    {
        LOGGER.info("Borra la cuentas de credito");
        return creditService.delete(account);
    }

    @GetMapping("/find/{account}")
    public Mono<Boolean> existClient(@PathVariable String account)
    {
        LOGGER.info("Valida la existencia de las cuentas de credito");
        return creditService.existsByNumberCredit(account);
    }

}