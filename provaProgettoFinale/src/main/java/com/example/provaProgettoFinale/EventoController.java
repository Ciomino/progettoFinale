package com.example.provaProgettoFinale;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/events")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @GetMapping
    public String listEvents(Model model) {
        model.addAttribute("events", eventoRepository.findAll());
        return "event-list";
    }

    @GetMapping("/add")
    public String showAddEventForm(@RequestParam("type") String type, Model model) {
        Evento evento;
        switch (type.toLowerCase()) {
            case "concerto":
                evento = new Concerto();
                break;
            case "conferenza":
                evento = new Conferenza();
                break;
            case "workshop":
                evento = new Workshop();
                break;
            default:
                throw new IllegalArgumentException("Invalid event type: " + type);
        }
        model.addAttribute("evento", evento);
        return "event-form";
    }


    @PostMapping
    public String addEvent(@ModelAttribute Evento evento){
        try {
            if(evento instanceof Concerto || evento instanceof Conferenza || evento instanceof Workshop){
                eventoRepository.save(evento);
            }else{
                throw new IllegalArgumentException("tipo di evento rotto " +evento.getClass().getSimpleName());
            }
        } catch (Exception e) {
            Logger.getLogger(EventoController.class.getName()).log(Level.SEVERE,null,e);
            return "error-page";
        }
        return "redirect:/events";
    }

    @GetMapping("/edit/{id}")
    public String showEditEventForm(@PathVariable("id") Long id, Model model) {
        Evento evento = eventoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event Id:" + id));
        model.addAttribute("evento", evento);
        return "event-form";
    }

    @PostMapping("/update/{id}")
    public String updateEvent(@PathVariable("id") Long id, @ModelAttribute Evento evento) {
        evento.setId(id);
        eventoRepository.save(evento);
        return "redirect:/events";
    }

    @GetMapping("/delete/{id}")
    public String deleteEvent(@PathVariable("id") Long id) {
        Evento evento = eventoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event Id:" + id));
        eventoRepository.delete(evento);
        return "redirect:/events";
    }

    @PostMapping("/book/{id}")
    public String bookEvent(@PathVariable("id") Long id) {
        Evento evento = eventoRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid event Id:" + id));
        if (evento.getPrenotati() < evento.getCapienza()) {
            evento.setPrenotati(evento.getPrenotati() + 1);
            eventoRepository.save(evento);
        }
        return "redirect:/events";
    }
}
