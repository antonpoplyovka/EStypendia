package com.kul.Estypendia.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public RedirectView handleError() {
        return new RedirectView("http://localhost:4200/students-list");

    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
