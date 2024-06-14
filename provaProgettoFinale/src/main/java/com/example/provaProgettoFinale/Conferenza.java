package com.example.provaProgettoFinale;

import jakarta.persistence.Entity;

@Entity
public class Conferenza extends Evento {
    private String relatore;

    public String getRelatore() {
        return relatore;
    }

    public void setRelatore(String relatore) {
        this.relatore = relatore;
    }

    @Override
    public void modifica() {
        // Implementazione specifica per Conferenza
    }

    @Override
    public void cancellazione() {
        // Implementazione specifica per Conferenza
    }

    @Override
    public void aggiungi() {
        // Implementazione specifica per Conferenza
    }
}
