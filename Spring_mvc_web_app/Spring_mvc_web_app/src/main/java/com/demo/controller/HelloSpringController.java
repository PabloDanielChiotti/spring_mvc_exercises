package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Para correr, pegarle a la direccion: 
// http://localhost:8080/Spring_mvc_web_app
// o
// http://localhost:8080/Spring_mvc_web_app/index.jsp

/**
 * Here we are going to talk about controller implementation. Spring MVC provides a controller interface and
 * a very rich class hierarchy for its web contract. The controller is responsible for accepting the HTTP
 * servlet request and the HTTP servlet response, performing some unit of work and passing control to a view.
 * The controller looks a lot like a standard servlet. The controller interface has many rich implementations
 * and a much more complete live cycle. 
 */
@Controller
public class HelloSpringController {

  /**
   * This RequesMapping annotation is used to map your URLs on an entire class or a particularly
   * handler method. Typically the type level annotation maps specifically request path or path
   * pattern onto a formal controller with additional method level annotations narrowing the primary
   * mapping for specific HTTP method request, such as GET or POST.
   * 
   * ModelMap, is an implementation of Map for building module data for use with UI tools. It
   * supports change calls and generation of module attributes names. ModuleMap's subclasses linked
   * HashMaps an provides some additional conveniences to me a bit easy to use by controllers.
   */
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {

    model.addAttribute("message", "Hello World!!!");
    // output, is the name of the view that we are goint to pass the control to. 
    return "output";

  }

}
