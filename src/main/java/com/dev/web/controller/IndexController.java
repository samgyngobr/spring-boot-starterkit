package com.dev.web.controller;

import com.dev.web.model.User;
import com.dev.web.repository.UserRepository;
import com.dev.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController
{
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("message", "Lorem Ipsum!");

        return "web/index/index";
    }



    @GetMapping("/about")
    public String about(Model model)
    {
        /*
        userService.save(
                "nome",
                "teste@teste.com",
                "0000-00-00 00:00:00",
                "*****",
                "%%%",
                "2022-07-25 00:00:00",
                "2022-07-25 00:00:00"
        );
        */

        List<User> users = userService.findAll();

        model.addAttribute("users", users);

        return "web/index/about";
    }

}
