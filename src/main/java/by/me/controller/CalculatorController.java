package by.me.controller;


import by.me.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.SessionScope;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.AsyncBoxView;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/calculator")
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @Autowired
    private HistoryController historyController;


    @GetMapping
    public String form() {
        return "calc";
    }

    @PostMapping
    public String calculate(@RequestParam Double num1, @RequestParam Double num2, @RequestParam String op, Model model, HttpSession httpSession) {
        double result = calculator.calc(num1, num2, op);
        historyController.getHistory(httpSession, model);
        ArrayList<String> history = (ArrayList<String>) model.getAttribute("history");
        history.add(num1 + " " + calculator.checkSymbol(op) + " " + num2 + " = " + result);
        model.addAttribute("result", result);
        return "calc";
    }
}
