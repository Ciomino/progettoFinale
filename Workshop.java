package com.example.FinalProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Workshop extends Evento{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String docente;
    private String ambito;
    private String descrizione;

    // @OneToMany(mappedBy="event")
    // private Set<UserEvent> userEvents = new HashSet<>();
    

    public Long getId() {
        return id;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
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
