package by.me.controller;


import by.me.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @GetMapping
    public String form(){
        return "calc";
    }

    @PostMapping
    public String calculate(@RequestParam Double num1, @RequestParam Double num2, @RequestParam String op, Model model) {
        double result = calculator.calc(num1, num2, op);
        model.addAttribute("result", result);
        return "calc";
    }
}
