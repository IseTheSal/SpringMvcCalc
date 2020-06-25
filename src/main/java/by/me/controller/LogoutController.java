package by.me.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/logout")
public class LogoutController {

    @GetMapping
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "calc";
    }
}