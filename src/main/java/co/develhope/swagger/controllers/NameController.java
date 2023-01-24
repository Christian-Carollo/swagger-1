package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @GetMapping("")
    public String sayWelcome(){
        return "Benvenuti in Name API";
    }


}