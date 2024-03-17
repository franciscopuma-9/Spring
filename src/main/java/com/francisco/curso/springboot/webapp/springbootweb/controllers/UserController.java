package com.francisco.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.francisco.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Francisco", "Puma");
        user.setEmail("franciscopuma@gmail.com");
        model.addAttribute("title",  "Hola mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = Arrays.asList(
        new User("Francisco","Puma", "francisco@gmail.com"),
        new User("Camila","Galarza"),
        new User("Agustin","Fugi","fugi@gmail.com"),
        new User("Lucero","Pacheco"));

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios");
        return "list";
    }
    
    

}
 