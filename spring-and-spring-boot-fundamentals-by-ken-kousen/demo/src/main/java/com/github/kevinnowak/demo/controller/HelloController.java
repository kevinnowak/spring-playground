package com.github.kevinnowak.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class HelloController {

    @GetMapping("/hello") // maps to http://localhost:8080/hello?name={name}
    public String sayHello(@RequestParam(defaultValue = "world") String name, Model model) {
        model.addAttribute("user", name);

        return "welcome"; // forward to src/main/resources/templates/welcome.html
    }
}
