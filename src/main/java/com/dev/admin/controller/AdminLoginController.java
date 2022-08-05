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
        model.addAttribute("message", "O Lorem Ipsum é um texto modelo da indústria tipográfica e de impressão. O Lorem Ipsum tem vindo a ser o texto padrão usado por estas indústrias desde o ano de 1500, quando uma misturou os caracteres de um texto para criar um espécime de livro. Este texto não só sobreviveu 5 séculos, mas também o salto para a tipografia electrónica, mantendo-se essencialmente inalterada. Foi popularizada nos anos 60 com a disponibilização das folhas de Letraset, que continham passagens com Lorem Ipsum, e mais recentemente com os programas de publicação como o Aldus PageMaker que incluem versões do Lorem Ipsum.");

        return "admin/login/index";
    }



    @GetMapping("/admin/login/forgot")
    public String forgot(Model model)
    {
        return "admin/login/forgot";
    }


    @GetMapping("/admin/login/register")
    public String register(Model model)
    {
        model.addAttribute("message", "Lorem Ipsum!");

        return "admin/login/register";
    }


}
