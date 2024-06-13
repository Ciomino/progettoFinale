package com.example.FinalProject;

import java.sql.Date;
import java.sql.Time;

public abstract class Evento {
    String nome;
    Date data;
    Time orario;
    String luogo;
    int durata;
    int capienza;
    int prenotati;
    double prezzo;
    String feedback;


    public abstract void modifica();
    public abstract void cancellazione();
    public abstract void aggiungi();

    

}
