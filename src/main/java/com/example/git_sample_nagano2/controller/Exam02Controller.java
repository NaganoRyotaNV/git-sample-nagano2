package com.example.git_sample_nagano2.controller;

import com.example.git_sample_nagano2.form.Exam02Form;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex02")

public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @GetMapping("")
    public String index(Exam02Form exam02Form) {
        return "exam02";
    }

    @PostMapping("/input")
    public String input(Exam02Form exam02Form) {
        exam02Form.setResult(exam02Form.getNum1() + exam02Form.getNum2());
        session.setAttribute("exam02Form", exam02Form);
        return "exam02-result";
    }

    @GetMapping("/output")
    public String output() {
        return "exam02-result";
    }

    @GetMapping("/output2")
    public String output2() {
        return "exam02-result2";
    }
}



