package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// Para correr, pegarle a la direccion:
// http://localhost:8080/Spring_mvc_webapp_multicontroller/multi-controller-annotations.jsp

/**
 * Para el controlador, "UserController", lo que se utilizo fue, 
 * org.springframework.web.servlet.mvc.multiaction.InternalPathMethodNameResolver
 * en el bean del dispatcher-servlet.xml. En este caso, lo que usamos es @RequestMapping
 * que vendría a ser lo mismo pero con annotations.
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

  @RequestMapping("/add")
  public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    return new ModelAndView("EmployeePage", "msg", "add() method");
  }
  
  @RequestMapping("/delete")
  public ModelAndView delete(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    return new ModelAndView("EmployeePage", "msg", "delete() method");
  }
  
  @RequestMapping("/update")
  public ModelAndView update(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    return new ModelAndView("EmployeePage", "msg", "update() method");
  }
  
  @RequestMapping("/list")
  public ModelAndView list(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    return new ModelAndView("EmployeePage", "msg", "list() method");
  }

}
