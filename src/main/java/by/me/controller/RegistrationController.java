package by.me.controller;


import by.me.entity.User;
import by.me.strorage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/reg")
public class RegistrationController {

    @Autowired
    private Storage storage;

    @GetMapping
    public String form() {
        return "reg";
    }

    @PostMapping
    public String regUser(@RequestParam String name, @RequestParam String login, @RequestParam String password, Model model) {
        User user = new User(password, login, name);
        if (!storage.checkOnExist(user)) {
            storage.addUser(user);
            return "main";
        } else {
            model.addAttribute("registration", "User with this login is already exist");
        }
        return "reg";
    }
}
