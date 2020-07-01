package by.me.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.ui.Model;


@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String ex(NullPointerException ex, Model model) {
        String message = ex.getMessage();
        model.addAttribute("message", message);
        return "userauth";
    }

}



