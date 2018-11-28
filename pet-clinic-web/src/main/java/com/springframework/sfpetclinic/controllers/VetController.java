package com.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"","/","/index.html"})
    public String index(){
        return  "vets/index";
    }

}
