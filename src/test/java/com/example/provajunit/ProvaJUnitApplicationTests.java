package com.example.provajunit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ProvaJUnitApplicationTests {

    private final ServiceImpl service;

    @Autowired
    ProvaJUnitApplicationTests(ServiceImpl service) {
        this.service = service;
    }

    @Test
    @Transactional
    void contextLoads() {
        User utente = new User();

        service.inserisciELavora(utente);

    }

}
