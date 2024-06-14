package com.example.provaProgettoFinale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("utente", new Utente());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(Utente utente) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        utente.setPassword(encoder.encode(utente.getPassword()));
        utente.setRole("USER");
        utenteRepository.save(utente);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
