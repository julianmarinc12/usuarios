package com.usuarios.web.controllers;

import com.usuarios.dao.DaoUsers;
import com.usuarios.domain.User;
import com.usuarios.services.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
