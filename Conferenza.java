package com.example.FinalProject;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Conferenza extends Evento{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String conduttore;
    private String ambito;
    private String descrizione;

    @OneToMany(mappedBy="event")
    private Set<UserEvent> userEvents = new HashSet<>();
    

    public Long getId() {
        return id;
    }

    public String getConduttore() {
        return conduttore;
    }

    public void setConduttore(String conduttore) {
        this.conduttore = conduttore;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public void modifica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifica'");
    }

    @Override
    public void cancellazione() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancellazione'");
    }

    @Override
    public void aggiungi() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aggiungi'");
    }
    
}
