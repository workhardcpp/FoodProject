package com.food101.project.theFood;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class registerController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        
        return "greeting";
    }

  

}