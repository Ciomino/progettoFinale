package com.example.FinalProject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class UtenteController {
    
    @Autowired
    private UtenteRepository utenteRepository;

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("utente", new Utente());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Utente utente , Model model) {
        Optional<Utente> utenteEsistente= utenteRepository.findByUsername(utente.getUsername());
        if(utenteEsistente.isPresent() && utenteEsistente.get().getPassword().equals(utente.getPassword())){
            //autenticazione riuscita / login
            return "redirect:/home";
        }else{
            model.addAttribute("error", "Username o password errati");
            return "login";
        }
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("utente", new Utente());
        return "register";
    }
    

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute Utente utente, Model model) {
        if(utenteRepository.findByEmail(utente.getEmail()).isPresent()){
            model.addAttribute("error", "Email gia' esistente. Per favore effettua il login");
            return "register";
        }
        if(utenteRepository.findByUsername(utente.getUsername()).isPresent()){
            model.addAttribute("error", "Username gia esistente. Per favore scegli un altro username");
            return "register";
        }
        //Salva il nuovo utente
        utenteRepository.save(utente);
        return "redirect:/login";
    }
    
    
}
