package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// Para correr, pegarle a la siguiente direccion:
// http://localhost:8080/Spring_mvc_model_view/multi-controller-properties.jsp

public class PaymentController extends MultiActionController {

  public ModelAndView capture(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
    return new ModelAndView("PaymentPage", "msg", "capture() method");
  }
  
  public ModelAndView setPaymentMethod(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
    return new ModelAndView("PaymentPage", "msg", "setPaymentMethod() method");
  }
  
  public ModelAndView saveCC(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
    return new ModelAndView("PaymentPage", "msg", "saveCC() method");
  }
  
  public ModelAndView process(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    
    return new ModelAndView("PaymentPage", "msg", "process() method");
  }

}
