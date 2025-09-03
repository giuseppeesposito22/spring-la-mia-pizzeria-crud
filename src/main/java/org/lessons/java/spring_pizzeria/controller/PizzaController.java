package org.lessons.java.spring_pizzeria.controller;

import java.util.List;

import org.lessons.java.spring_pizzeria.model.Pizza;
import org.lessons.java.spring_pizzeria.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PizzaController {

    @Autowired
    private PizzaRepository repo;

    @GetMapping
    public String index(Model model){
        List<Pizza> pizzas = repo.findAll();
        model.addAttribute("pizzas", pizzas);
        return "books/index";
    }
    
}
