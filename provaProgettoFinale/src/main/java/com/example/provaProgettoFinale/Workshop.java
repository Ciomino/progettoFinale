package com.example.provaProgettoFinale;

import jakarta.persistence.Entity;

@Entity
public class Workshop extends Evento {
    private String argomento;

    public Workshop() {
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    @Override
    public void modifica() {
        // Implementazione specifica per Workshop
    }

    @Override
    public void cancellazione() {
        // Implementazione specifica per Workshop
    }

    @Override
    public void aggiungi() {
        // Implementazione specifica per Workshop
    }
}
