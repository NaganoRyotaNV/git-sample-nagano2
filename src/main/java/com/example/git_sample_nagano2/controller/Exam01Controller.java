package com.example.git_sample_nagano2.controller;

import com.example.git_sample_nagano2.form.Exam01Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam1")

public class Exam01Controller {
    @GetMapping("")
    public String index(Exam01Form exam01Form) {
        return "exam01";
    }

    @PostMapping("/name")
    public String name(Exam01Form exam01Form, Model model) {
        model.addAttribute("exam01Form", exam01Form);
        return "exam01-result";
    }
}