# Relazioni JPA tra utente e gli eventi (concerto, conferenza, workshop)

Abbiamo utilizzato le annotazioni di JPA (`@ManyToMany`) per creare una relazione tra l'entità utente e le entità eventi creando una tabella di join chiamata prenotazioni.

## Entity Prenotazioni
### Attributi:
- `id`: Long (Chiave Primaria)
- `user`: User (Chiave Esterna)
- `event`: Event (Chiave Esterna)

### Relazioni:
- **Tipo di Relazione:** Molti a Uno con User
- **Tipo di Relazione:** Molti a Uno con Event

## Entity User
### Attributi:
- `id`: Long (Chiave Primaria)
- `username`: String
- `password`: String
- `dataNascita`: Date

### Relazioni:
- **Tipo di Relazione:** Uno a Molti con Prenotazioni

## Entity Concert
### Attributi:
- `id`: Long (Chiave Primaria)
- `name`: String

### Relazioni:
- **Tipo di Relazione:** Uno a Molti con Prenotazioni

## Entity Conference
### Attributi:
- `id`: Long (Chiave Primaria)
- `name`: String

### Relazioni:
- **Tipo di Relazione:** Uno a Molti con Prenotazioni

## Entity Workshop
### Attributi:
- `id`: Long (Chiave Primaria)
- `name`: String

### Relazioni:
- **Tipo di Relazione:** Uno a Molti con Prenotazioni

## Entity Prenotazione
### Attributi:
- `dataPrenotazione`: Timestamp

