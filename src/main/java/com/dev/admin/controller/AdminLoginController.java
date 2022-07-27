package com.dev.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminLoginController
{
    @GetMapping("/admin/login")
    public String index(Model model)
    {
        model.addAttribute("message", "Lorem Ipsum!");

        return "admin/login/index";
    }

    @GetMapping("/admin/login/forgot")
    public String forgot(Model model)
    {
        model.addAttribute("message", "Lorem Ipsum!");

        return "admin/login/forgot";
    }


    @GetMapping("/admin/login/register")
    public String register(Model model)
    {
        model.addAttribute("message", "Lorem Ipsum!");

        return "admin/login/register";
    }


}
