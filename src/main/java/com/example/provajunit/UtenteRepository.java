package com.example.provajunit;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Emanuele Zicola - 26/10/2021
 */
public interface UtenteRepository extends JpaRepository<User, Long> {
}
