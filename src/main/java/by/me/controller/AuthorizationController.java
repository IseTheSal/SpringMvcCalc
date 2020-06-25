package by.me.controller;


import by.me.service.Calculator;
import by.me.strorage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/auth")
public class AuthorizationController {

    @Autowired
    private Storage storage;

    @GetMapping
    public String form() {
        return "auth";
    }

    @PostMapping
    public String auth(@RequestParam String login, @RequestParam String password, Model model, HttpSession httpSession) {
        if (storage.checkUser(login, password)) {
            httpSession.setAttribute("authCheck", true);
            return "main";
        } else {
            httpSession.setAttribute("authCheck", false);
            model.addAttribute("auth", "No.");
            return "auth";
        }
    }
}
