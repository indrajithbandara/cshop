package io.ermdev.cshop.web.controller;

import io.ermdev.cshop.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"hasUser", "cartItems"})
public class LoginController {

    private UserService userService;

    @Autowired
    private LoginController(UserService userService) {
        this.userService=userService;
    }

    @GetMapping("login")
    public String showLogin() {
        return "v2/login";
    }

    @PostMapping("login/success")
    public String redirectAfterLoginSuccess(Model model) {
        model.addAttribute("hasUser", true);
        return "redirect:/catalog";
    }
}