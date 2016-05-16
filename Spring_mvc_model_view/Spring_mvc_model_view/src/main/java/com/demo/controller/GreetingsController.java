package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

// Para correrlo, pegarle a la siguiente direccion:
// http://localhost:8080/Spring_mvc_model_view/greetings
public class GreetingsController extends AbstractController {

  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
    
    ModelAndView model = new ModelAndView("GreetingsPage");
    return model;
  }

}
