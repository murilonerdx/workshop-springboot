package com.springboot.main.resources;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorHandlerController implements ErrorController{

    @Override
    @RequestMapping("/error")
    @ResponseBody
    public String getErrorPath() {
        return "<center><h1>Encontrou um erro!.</h1></center>";
    }
}