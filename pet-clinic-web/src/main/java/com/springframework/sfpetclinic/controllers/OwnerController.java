package com.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"/", "/index.html", "/index", "/owners.html"})
    public String index() {
        return "owners/index";
    }
}
