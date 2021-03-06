package com.example.question.controller;



import com.example.question.entity.User;
import com.example.question.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userform", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@Valid @ModelAttribute("userform") User userform, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            return "registration";
        }
//        if (!userForm.getPassword().equals(userForm.getConfirm())){
//            model.addAttribute("passwordError", "Пароли не совпадают");
//            return "registration";
//        }
//        if (!userService.saveUser(userForm)){
//            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
//            return "registration";
//        }
            userService.saveUser(userform);
        return "redirect:/main";
    }
}
