package com.example.demo.controllers;


import com.example.demo.models.CatFact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CatFactController {
    CatFact cf = new CatFact();

    @GetMapping("/")
    public String index(Model catFactModel){
        catFactModel.addAttribute("catFactToDisplay", cf);
        return "index";
    }

    @PostMapping("/postCatFact")
    public String postCatFact(WebRequest dataFromForm){
        cf.setFactText(dataFromForm.getParameter("catfact"));
        return "redirect:/";
    }
}
