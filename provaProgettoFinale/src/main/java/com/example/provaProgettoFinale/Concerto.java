package com.example.provaProgettoFinale;

import jakarta.persistence.Entity;

@Entity
public class Concerto extends Evento {
    private String artista;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public void modifica() {
        // Implementazione specifica per Concerto
    }

    @Override
    public void cancellazione() {
        // Implementazione specifica per Concerto
    }

    @Override
    public void aggiungi() {
        // Implementazione specifica per Concerto
    }
}
