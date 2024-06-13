// package com.example.FinalProject;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;

// @Entity
// public class UserEvent {
//     @Id
//     @GeneratedValue(strategy= GenerationType.IDENTITY)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name = "utente_id")
//     private Utente utente;

//     @ManyToOne
//     @JoinColumn(name = "event_id")
//     private Evento evento;

    

//     public Utente getUtente() {
//         return utente;
//     }

//     public Evento getEvento() {
//         return evento;
//     }

//     public void setUtente(Utente utente) {
//         this.utente = utente;
//     }

//     public void setEvento(Evento evento) {
//         this.evento = evento;
//     }

//     public Long getId() {
//         return id;
//     }

    
    
// }
