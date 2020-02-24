package com.example.sprliq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {


    private PersonRepository personRepository;

    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping()
    public String createPerson(@RequestParam String name){
        personRepository.save(new Person(name, "6.7"));
        return personRepository.findByName(name) + " saved successfully";
    }

    @GetMapping("/all")
    public List<Person> getAllThePeople(){
        Person testPerson = new Person();
        testPerson.setName("ABC");
        testPerson.setHeight("5.7");
//        return (List<Person>) personRepository.findAll();
        return Arrays.asList(testPerson);
    }
}
