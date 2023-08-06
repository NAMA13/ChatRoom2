package com.chat.room.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    @GetMapping
    public String showHome() {
        return "chat";
    }

    @GetMapping("/login")
    public String showLogin(Model model) {
        return "login";
    }

}

