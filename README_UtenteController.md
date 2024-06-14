# progettoFinale

## UtenteController
UtenteController gestisce le richieste HTTP relative alla gestione del sito. Fornisce endpoint per visualizzare il login, il form di registrazione, processare i dati, permette all’utente di prenotare o disdire un evento. Permette di cercare un evento per categoria, nome e data.

### Annotazioni
- **@Controller:** Indica che la classe è un controller Spring MVC.
- **@GetMapping:** Mappa le richieste HTTP GET a un metodo specifico.
- **@PostMapping:** Mappa le richieste HTTP POST a un metodo specifico.
- **@Autowired:** Lega l’ UtenteRepository a UtenteController.

### Metodi

#### showRegistrationForm
- **Descrizione:** Visualizza il form di registrazione.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (register.html).
- **Dettagli:** Aggiunge un nuovo oggetto User al modello, che sarà legato ai campi del form nella vista register.html.

#### registerUser
- **Descrizione:** Salva un utente che si è appena registrato.
- **Parametri:** `Utente utente`: L'oggetto utente appena creato.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare, torna alla pagina del login (redirect:/login).

#### showLoginForm
- **Descrizione:** Visualizza il form di registrazione.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (login.html).

#### login
- **Descrizione:** Visualizza il form di login con un collegamento alla registrazione dell’account se devi registrarti.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (login).
- **Dettagli:** Aggiunge un nuovo oggetto Utente al modello, che sarà legato ai campi del form nella vista login.html.

#### cancellazionePrenotazione
- **Descrizione:** Permette di eliminare una prenotazione effettuato da un utente.
- **Parametri:** _Work in progress_
- **Ritorna:** _Work in progress_
- **Dettagli:** Elimina il campo nel database e attiva una nuova prenotazione. _Work in progress_

#### prenotazione
- **Descrizione:** Crea una nuova prenotazione di un evento.
- **Parametri:** _Work in progress_
- **Ritorna:** _Work in progress_
- **Dettagli:** Aggiunge un nuovo

### View

- **login.html**
- **register.html**
- **home.html**



