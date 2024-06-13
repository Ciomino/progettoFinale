package com.example.FinalProject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Concerto extends Evento{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String artista;
    
    // @OneToMany(mappedBy="event")
    // private Set<UserEvent> userEvents = new HashSet<>();

    



    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Long getId() {
        return id;
    }

    public String getArtista() {
        return artista;
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
