package by.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/main")
public class MainController {
    @GetMapping
    public String main(@RequestParam(defaultValue = "Welcome!") String name, Model model) {
        model.addAttribute("welcome", name);
        return "main";
    }
}
