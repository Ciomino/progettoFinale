# progettoFinale
## SpringSecurity
Spring Security è un potente framework di autenticazione e controllo degli accessi altamente personalizzabile per applicazioni Java. È lo standard de facto per la protezione delle applicazioni basate su Spring. Questo progetto mostra un'applicazione Spring Boot semplice protetta con Spring Security.

### Configurazione
Aggiungi le dipendenze necessarie nel tuo pom.xml:
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <!-- Aggiungi altre dipendenze se necessario -->
</dependencies>


### Requisiti
- Java 11 o successivo
- Maven 3.6.0 o successivo
- Spring Boot 2.5.0 o successivo

### Utilizzo
#### Autenticazione
Spring Security fornisce un form di login predefinito che può essere personalizzato. L'esempio sopra mostra come creare un form di login personalizzato.

#### Test
Puoi testare la configurazione di sicurezza utilizzando strumenti come Postman o semplicemente attraverso il browser.
