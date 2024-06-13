package com.example.FinalProject;

import java.sql.Date;
import java.sql.Time;


public abstract class Evento {
    private String nome;
    private Date data;
    private Time orario;
    private String luogo;
    private int durata;
    private int capienza;
    private int prenotati;
    private double prezzo;
    private String feedback;


    public abstract void modifica();
    public abstract void cancellazione();
    public abstract void aggiungi();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Time getOrario() {
        return orario;
    }
    public void setOrario(Time orario) {
        this.orario = orario;
    }
    public String getLuogo() {
        return luogo;
    }
    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }
    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }
    public int getCapienza() {
        return capienza;
    }
    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }
    public int getPrenotati() {
        return prenotati;
    }
    public void setPrenotati(int prenotati) {
        this.prenotati = prenotati;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    

}
