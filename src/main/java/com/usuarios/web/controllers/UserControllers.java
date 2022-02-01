package com.usuarios.web.controllers;

import com.usuarios.dao.DaoUsers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class UserControllers {

    private DaoUsers daoUsers;

    @GetMapping("/")
    public String inicio(Model model){

        var user= daoUsers.findAll();
        model.addAttribute("user",user);
        return "index";
    }

}
