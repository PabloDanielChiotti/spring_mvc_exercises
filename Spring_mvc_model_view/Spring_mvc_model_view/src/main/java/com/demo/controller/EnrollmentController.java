package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// Para correrlo, pegarle a la siguiente direccion:
// http://localhost:8080/Spring_mvc_model_view/multi-controller-properties-enrollment.jsp
public class EnrollmentController extends MultiActionController {

  public ModelAndView enroll(HttpServletRequest request, HttpServletResponse response) throws Exception {
    return new ModelAndView("EnrollmentPage", "msg", "enroll() method");
  }

  public ModelAndView findProvider(HttpServletRequest request, HttpServletResponse response) throws Exception {
    return new ModelAndView("EnrollmentPage", "msg", "findProvider() method");
  }
  
  public ModelAndView addApplication(HttpServletRequest request, HttpServletResponse response) throws Exception {
    return new ModelAndView("EnrollmentPage", "msg", "addApplication() method");
  }
  
  public ModelAndView listPractitioner(HttpServletRequest request, HttpServletResponse response) throws Exception {
    return new ModelAndView("EnrollmentPage", "msg", "listPractitioner() method");
  }
  
}
