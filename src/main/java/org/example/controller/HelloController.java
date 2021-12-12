package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String sayHello(Model model) {
        String name = System.getenv("Visitor_Name");
        if(name ==null) {
            name = "World";
        }
        model.addAttribute("name", name);
        return "index";
    }
}
