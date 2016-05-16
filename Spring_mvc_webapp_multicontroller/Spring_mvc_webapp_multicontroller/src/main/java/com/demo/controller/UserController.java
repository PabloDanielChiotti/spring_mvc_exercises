package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

// Para correr, pegarle a la direccion:
// http://localhost:8080/Spring_mvc_webapp_multicontroller/multi-controller.jsp

/**
 * En spring MVC application, multiaction controller es usado para agrupar acciones similares dentro
 * de un unico controlador. The controller implementation that allows multiple request types to be
 * handle by the same class. Subclass of MultiActionController can handle several different types of
 * requests with methods of the same form.
 */
public class UserController extends MultiActionController {

  /**
   * ModelAndView, is a holder for both, the model and the view, in the web mvc framework.
   */

  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    System.out.println("[addUser]");
    /**
     * "UserPage", es la pagina a la que quiero ir. "msg", the key for the message. "add() method",
     * the message value.
     */
    return new ModelAndView("UserPage", "msg", "add() method");
  }

  public ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    System.out.println("[deleteUser]");
    return new ModelAndView("UserPage", "msg", "delete() method");
  }

  public ModelAndView updateUser(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    System.out.println("[updateUser]");
    return new ModelAndView("UserPage", "msg", "update() method");
  }

  public ModelAndView listUser(HttpServletRequest request, HttpServletResponse response)
      throws Exception {
    System.out.println("[listUser]");
    return new ModelAndView("UserPage", "msg", "list() method");
  }


}
