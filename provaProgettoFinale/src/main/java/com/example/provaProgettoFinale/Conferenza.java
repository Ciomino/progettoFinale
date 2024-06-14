package com.example.provaProgettoFinale;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;

@Entity
public class Conferenza extends Evento {
    private String relatore;


    public Conferenza(Long id, String nome, Date data, Time orario, String luogo, int durata, int capienza,
                      int prenotati, double prezzo, String feedback, String relatore) {
        super();
        this.setId(id);
        this.setNome(nome);
        this.setData(data);
        this.setOrario(orario);
        this.setLuogo(luogo);
        this.setDurata(durata);
        this.setCapienza(capienza);
        this.setPrenotati(prenotati);
        this.setPrezzo(prezzo);
        this.setFeedback(feedback);
        this.relatore = relatore;
    }


    public Conferenza() {
    }

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
