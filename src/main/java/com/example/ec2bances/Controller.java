package com.example.ec2bances;


import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/") //link principal padre
public class Controller{
    //link segundo hijo
        @GetMapping(path="/") 
        public String home(){
            return "PT71467042 - Alexis Bances Alcantara";
        }
        @GetMapping(path="/idat/codigo") 
        public String codigo(){
            return "PT71467042";
        }
        @GetMapping(path="/idat/nombre") 
        public String nombrecompleto(){
            return "Alexis Bances Alcantara";
        }
}