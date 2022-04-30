package com.example.frsystem.web;

import com.example.frsystem.Model.Exceptions.FieldsNotPopulatedException;
import com.example.frsystem.Model.Exceptions.PasswordsDontMatchException;
import com.example.frsystem.Model.Exceptions.UsernameAlreadyExistsException;
import com.example.frsystem.Services.Impl.AuthenticationServiceImpl;
import com.example.frsystem.Services.Impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    private final AuthenticationServiceImpl authenticationService;
    private final UserServiceImpl userService;

    public RegisterController(AuthenticationServiceImpl authenticationService, UserServiceImpl userService){
        this.authenticationService = authenticationService;
        this.userService = userService;
    }

    @GetMapping
    public String registerPage(@RequestParam(required = false) String error, Model model){
        if(error != null && !error.isEmpty()){
            model.addAttribute("hasError", true);
            model.addAttribute("error", error);
        }
        model.addAttribute("bodyContetn","register");
        return "register.html";
    }

    @PostMapping
    public String register(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam String password,
                           @RequestParam String confirmPassword)  {
        try {
            this.userService.register(username,email,password,confirmPassword);
            return "redirect:/login";
        }catch (FieldsNotPopulatedException | PasswordsDontMatchException | UsernameAlreadyExistsException exception){
            return "redirect:/register?error=" + exception.getMessage();
        }
    }

}
