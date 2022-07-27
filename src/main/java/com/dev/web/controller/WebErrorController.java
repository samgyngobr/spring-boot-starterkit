package com.dev.web.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WebErrorController implements ErrorController
{

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model)
    {
        // get error status
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        // TODO: log error details here

        if (status != null)
        {
            int statusCode = Integer.parseInt(status.toString());

            // display specific error page
            if (statusCode == HttpStatus.NOT_FOUND.value())
            {
                model.addAttribute("code", "404");
            }
            else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value())
            {
                model.addAttribute("code", "500");
            }
            else if (statusCode == HttpStatus.FORBIDDEN.value())
            {
                model.addAttribute("code", "403");
            }
        }

        // display generic error
        return "error";
    }
}