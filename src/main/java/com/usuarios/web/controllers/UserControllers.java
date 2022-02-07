package com.usuarios.web.controllers;


import com.usuarios.domain.User;
import com.usuarios.services.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;


@Controller
@Slf4j
public class UserControllers {

    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String inicio(Model model){

        var users=userServices.getUser() ;
        model.addAttribute("users",users);
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(User user){
        return "modificar";

    }

    @PostMapping("/guardar")
    public String guardar(@Valid User user, Errors errors){
        if(errors.hasErrors()){
            return "modificar";
        }
        userServices.save(user);
        return "redirect:/" ;
    }

    @GetMapping("/edit/{id}")

    public String edit(User user, Model model){
        user = userServices.getUserByid(user);
        model.addAttribute("user", user );
       return "modificar";
    }

    @GetMapping("/delete/{id}")
    public String delete(User user){
        userServices.dalete(user);
        return "redirect:/";
    }



}
