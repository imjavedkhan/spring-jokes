package com.primus.springjokes.controllers;

import com.primus.springjokes.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokesService jokesService;

    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    private String showJoke(Model model){
        model.addAttribute("joke",jokesService.getJoke());

        return "index";
    }
}
