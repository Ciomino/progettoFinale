# progettoFinale

## EventoController
EventoController gestisce le richieste HTTP relative alla gestione del sito. Fornisce endpoint per visualizzare la lista degli eventi, il form di aggiunta degli eventi, processa i dati, permette all’utente di prenotare o disdire un evento.

### Annotazioni
- **@Controller:** Indica che la classe è un controller Spring MVC.
- **@RequestMapping:** Mappa le richieste HTTP .
- **@GetMapping:** Mappa le richieste HTTP GET a un metodo specifico.
- **@PostMapping:** Mappa le richieste HTTP POST a un metodo specifico.
- **@Autowired:** Lega l’ EventoRepository a EventoController.
- **@RequestParam:** Richiede un parametro specifico.
  

### Metodi

#### listEvents
- **Descrizione:** Visualizza gli eventi disponibili.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (event-list.html).

#### showAddEventForm
- **Descrizione:** Visualizza il form di aggiunta di un evento
- **Parametri:** `@RequestParam("type") String type`: il tipo di evento.
- **Parametri:**`Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare, torna alla pagina del login (event-form.html).
-  **Dettagli:** C'è uno switch che sceglie il tipo di evento

#### showLoginForm
- **Descrizione:** Visualizza il form di registrazione.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (login.html).

#### addEvent
- **Descrizione:**Aggiunge un evento alla lista.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (redirect:/events).
- **Dettagli:** Salva l'evento nella lista.

#### showEditEventForm
- **Descrizione:** Visualizza il form di modifica evento.
- **Parametri:** `Model model`: L'oggetto del modello è utilizzato per passare dati alla vista.
- **Parametri:**:`@PathVariable("id") Long id`:l'id dell'evento.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (event-form.html).


#### updateEvent
-**Descrizione:**  Modifica l'evento.
- **Parametri:** `@ModelAttribute Evento evento`: L'oggetto evento utilizzato per passare dati alla vista.
- **Parametri:**:`@PathVariable("id") Long id`:l'id dell'evento.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (redirect:/events).

#### deleteEvent
-**Descrizione:**  Cancella un evento.
- **Parametri:**:`@PathVariable("id") Long id`:l'id dell'evento.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (redirect:/events).

#### bookEvent
-**Descrizione:**  Prenota un evento.
- **Parametri:**:`@PathVariable("id") Long id`:l'id dell'evento.
- **Ritorna:** `String`: Il nome del template Thymeleaf da visualizzare (redirect:/events).





  
### View

- **event-list.html**
- **event-form.html**
  
