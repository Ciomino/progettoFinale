# progettoFinale


CONCERTO

Introduzione
L'entità Concerto rappresenta un evento musicale. Estende l'entità Evento e include informazioni specifiche come l'artista. Supporta operazioni di aggiunta, modifica e cancellazione tramite annotazioni personalizzate.
Descrizione Generale
L'entità ‘Concerto’ è utilizzata per memorizzare dettagli relativi ai concerti, inclusi l'identificatore univoco e l'artista. Estende l'entità Evento, ereditando i suoi attributi e metodi.
ATTRIBUTI
-        Id: Identificatore univoco del concerto
-        Artista: Nome dell’artista che si esibisce al concerto

Vincoli
·       L'attributo id deve essere univoco e autoincrementato.
·       L'attributo artista è obbligatorio.
 
   
WORKSHOP

Introduzione
L'entità Workshop rappresenta un evento di apprendimento. Estende l'entità Evento e include informazioni specifiche come il docente, l'ambito e la descrizione. Supporta operazioni di aggiunta, modifica e cancellazione tramite annotazioni personalizzate.
Descrizione Generale
L'entità ‘Workshop’ è utilizzata per memorizzare dettagli relativi ai seminari, inclusi l'identificatore univoco, il docente, l'ambito e una descrizione dettagliata. Estende l'entità Evento, ereditando i suoi attributi e metodi.
ATTRIBUTI
-        Id: Identificatore univoco del workshop
-        Docente: Nome del docente che conduce il workshop
-        Ambito: Ambito tematico del workshop
-        Descrizione: Descrizione del workshop

Vincoli
·       L'attributo id deve essere univoco e autoincrementato.
·       Gli attributi ‘docente’ e ‘ambito’ sono obbligatori.
 
 
 



CONFERENZA
Introduzione
L'entità Conferenza rappresenta un evento di discussione o presentazione. Estende l'entità Evento e include informazioni specifiche come il docente, l'ambito e la descrizione. Supporta operazioni di aggiunta, modifica e cancellazione tramite annotazioni personalizzate.
Descrizione Generale
L'entità ‘Conferenza viene utilizzata per memorizzare dettagli relativi alle conferenze, inclusi l'identificatore univoco. il conduttore, l'ambito e una descrizione. Estende l'entità Evento, ereditando i suoi attributi e metodi.
ATTRIBUTI
-        Id: identificatore univoco della conferenza
-        Conduttore: nome del conduttore della conferenza
-        Ambito: ambito tematico della conferenza
-        Descrizione: descrizione della conferenza

Vincoli
·       L'attributo id deve essere univoco e autoincrementato.
·       Gli attributi ‘conduttore e ‘ambito’ sono obbligatori.


UTENTE
 
Introduzione
L'entità Utente rappresenta un utente del sistema. Questa entità è essenziale per la gestione delle informazioni sugli utenti, inclusi i loro dati personali.
Descrizione Generale
L'entità Utente viene utilizzata per memorizzare i dettagli relativi agli utenti. Include informazioni come nome, email, data di nascita. Inoltre, un utente può prenotare un evento, disdirlo o lasciare un feedback
ATTRIBUTI
-        Id  (univoco)
-        username
-        email (univoca)
-        password
-        dataDiNascita

Vincoli
L'attributo email deve essere univoco per ogni cliente.
L'attributo id deve essere un numero intero positivo e univoco.

 
ADMIN
 
Introduzione
L'entità Admin rappresenta un admin del sistema. Questa entità è essenziale per la gestione e modifica degli eventi.
Descrizione Generale
L'entità Admin viene utilizzata per memorizzare i dati relativi agli admin . Include informazioni come nome, email,password. Inoltre, un admin può modificare un evento, cancellarlo o aggiungerlo.In più può simulare una prenotazione.
ATTRIBUTI
-        Id  (univoco)
-        username
-        email (univoca)
-        password

Vincoli
L'attributo email deve essere univoco per ogni cliente.
L'attributo id deve essere un numero intero positivo e univoco.

PRENOTAZIONE

Introduzione
L'entità Prenotazione rappresenta una prenotazione dell'utente su un evento. 
Descrizione Generale
Questa entità serve per mettere in relazione l'utente con le sue prenotazioni. Include informazioni come id dell'utente e tipo di entità per avere la relazione.
ATTRIBUTI
-        Id  (univoco)
-        IdUtente
-        tipoEntita
         

Vincoli
L'attributo id deve essere un numero intero positivo e univoco.


