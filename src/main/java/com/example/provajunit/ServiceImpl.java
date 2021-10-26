package com.example.provajunit;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Emanuele Zicola - 26/10/2021
 */
@Service
@AllArgsConstructor
public class ServiceImpl {

    private final UtenteRepository utenteRepository;

    @Transactional
    public User inserisciELavora(User utente) {
        List<User> utentiSalvati = utenteRepository.findAll();
        utentiSalvati.forEach(System.out::println);
        utenteRepository.saveAndFlush(utente);

        utente.setNome("Ciccio");
        utente.setCognome("Gamer89");

        utenteRepository.save(utente);

        return utente;
    }


}
