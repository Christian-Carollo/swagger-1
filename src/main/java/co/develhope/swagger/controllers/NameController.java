package co.develhope.swagger.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @GetMapping("")
    public String sayWelcome(){
        return "Benvenuti in Name API";
    }

    @GetMapping(value = "/multiplication")
    public int getMultiplication(@RequestParam(required = true) int operand1,
                                 @RequestParam(required = true) int operand2){
        return operand1 * operand2;
    }
    @GetMapping(value = "/division")
    public int getDivision(@RequestParam(required = true) int division1,
                           @RequestParam(required = true)int division2){
        return division1 / division2;
    }

    @GetMapping(value = "/divisione")
    public int getDivisione(){
        int a=5;
        int b=5;
        return a / b;
    }







}