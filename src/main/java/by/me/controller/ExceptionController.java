package by.me.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import by.me.service.UserNotFoundException;
import org.springframework.ui.Model;


@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public String ex(NullPointerException ex, Model model) {
        String message = ex.getMessage();
        model.addAttribute("message", message);
        return "userauth";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String ex (UserNotFoundException ex, Model model){
        String message = ex.getMessage();
        model.addAttribute("message", message);
        return "userauth";
    }

}



