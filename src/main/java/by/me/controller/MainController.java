package by.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/main")
public class MainController {
    @GetMapping
    public String main(String name, int age, Model model) {
        model.addAttribute("myName", name);
        model.addAttribute("myAge", age);
        System.out.println(name + " " + age);
        return "main";
    }

}
