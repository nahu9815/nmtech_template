/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmtech.template.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nmart
 */
@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class HolaMundoController {
    
    
    @GetMapping
    public String saludo(){
        return "Hola mundo";
    }
}
