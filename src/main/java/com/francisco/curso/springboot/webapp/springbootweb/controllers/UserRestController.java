package com.francisco.curso.springboot.webapp.springbootweb.controllers;

//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francisco.curso.springboot.webapp.springbootweb.models.User;
import com.francisco.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api") 
public class UserRestController {
    //Map
    // @GetMapping("/details")
    // public Map<String, Object> details(){
        // User user = new User("Francisco", "Puma");
        // Map<String, Object > body = new HashMap<>();
        

        // body.put("title",  "Hola mundo Spring Boot");
        // body.put("user", user);

        // return body;
    // }
    //Dto
    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Francisco", "Puma");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot");
    
        
        
    return userDto;
    }
    
    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Francisco", "Puma");
        User user2 = new User("Camila", "Galarza");
        User user3 = new User("Agustin", "Fugi");

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        List<User> users = Arrays.asList(user, user2, user3); //lista en una linea

        return users;
    }
}
