package by.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    @GetMapping
    public String getHistory(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("history") == null) {
            httpSession.setAttribute("history", new ArrayList<>());
        }
        ArrayList<String> history = (ArrayList<String>) httpSession.getAttribute("history");
        model.addAttribute("history", history);
        return "history";
    }
}
