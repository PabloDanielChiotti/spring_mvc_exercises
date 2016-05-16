package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

// Para correr, pegarle a la direccion:
// http://localhost:8080/Spring_mvn_resource_bundle_view_resolver/resourcebundleview
public class ResourceBundleViewController extends AbstractController {

  @Override
  protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
    ModelAndView model = new ModelAndView("ResourceBundleViewResolverPage");
    return model;
  }

}
