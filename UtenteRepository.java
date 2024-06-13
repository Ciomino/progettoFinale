package com.example.FinalProject;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface  UtenteRepository extends JpaRepository<Utente, Long>{
    Optional<Utente> findByUsername(String username);
    Optional<Utente> findByEmail(String email);

}
