package com.springframework.sfpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owner",  "owner/index.html", "owner/index","owner/owners.html"})
    public String index() {
        return "index";
    }
}
