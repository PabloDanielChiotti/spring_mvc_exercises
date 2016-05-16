package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Esta clase sirve para configurar como lo haciamos en el dispatcher-servlet.xml anteriormente.
 * Antes configuramos spring mvc configuration en el archivo web.xml y por consiguiente en
 * el dispatcher-servlet.xml. Ahora lo que vamos a hacer, es configurar el spring mvc pero a
 * traves de una clase java con las anotaciones.
 */
// significa que la clase puede ser usada por el spring ioc container como una fuente
// de definiciones de beans.
@Configuration
// declara un apoyo especifico para el manejo de anotaciones mvc en los controladores.
// en otras palabras, para las anotaciones de @controller y @RequestMapping.
// es lo mismo que tener el tag <mvc:annotation-driven />.
@EnableWebMvc
// es lo mismo que tener el <context:component-scan base-package="com.demo.controller" />
@ComponentScan(basePackages = "com.demo")
public class WebConfig {

  @Bean
  public InternalResourceViewResolver viewResolver() {
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/pages/");
    resolver.setSuffix(".jsp");
    return resolver;
  }

  @Bean
  public ResourceBundleMessageSource messageSource() {
    ResourceBundleMessageSource source = new ResourceBundleMessageSource();
    source.setBasename("messages");
    source.setUseCodeAsDefaultMessage(true);
    return source;
  }

}
