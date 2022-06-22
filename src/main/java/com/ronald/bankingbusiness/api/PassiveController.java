package com.ronald.bankingbusiness.api;

import com.ronald.bankingbusiness.model.document.Passive;
import com.ronald.bankingbusiness.model.service.ClientService;
import com.ronald.bankingbusiness.model.service.PassiveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.ReactiveUpdateOperation;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.crypto.MacSpi;
import java.lang.invoke.MethodHandles;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/passive")
public class PassiveController
{

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private PassiveService passiveService;

    @GetMapping("/{account}")
    public Mono<Boolean> existAccount(@PathVariable String account)
    {
        LOGGER.info("Validar existencia de una cuenta pasiva");
        return passiveService.existsByNumberAccount(account);
    }

    @PostMapping
    public Mono<Passive> registerAccount(@RequestBody Passive passive)
    {
        LOGGER.info("Registro de una cuenta pasiva");
        return passiveService.saveAccount(passive);
    }

    @GetMapping
    public Flux<Passive> getAccount()
    {
        LOGGER.info("Obtener todas las cuentas pasivas");
        return passiveService.getAllAccounts();
    }

}
