package com.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"vets","vets/index","vets/index.html"})
    public String listVet(){
        return"/vets/index";
    }
}
