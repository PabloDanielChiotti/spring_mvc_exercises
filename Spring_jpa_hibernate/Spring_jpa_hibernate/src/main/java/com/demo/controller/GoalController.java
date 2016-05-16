package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.model.Goal;
import com.demo.model.GoalReport;
import com.demo.service.GoalService;


/**
 * Para que corrar pegarle a la direccion:
 * http://localhost:8080/Spring_jpa_hibernate/index.jsp
 * 
 * Por otro lado, para pegarle a la pagina que te muestra todos los goals, ir a:
 * http://localhost:8080/Spring_jpa_hibernate/getGoals.html
 * 
 * Para pegarle a la pagina que te muestra todos los goals pero con una 
 * consulta que hace un join entre goal y exercise tables y que trae la
 * informacion en un objecto llamada GoalReport, pegarle a esta dir:
 * http://localhost:8080/Spring_jpa_hibernate/getGoalReports.html
 */
@Controller
//a traves del la anotacion que se encuentra a continuacion y la anotacion @ModelAttribute
//es que una vez que cargamos el goal, ese se guarda en nuestra session. esto es importante
//a la hora de cuando en el controlador de minutesController, tomamos de la session
//el atributo con nombre "goal".
@SessionAttributes("goal")
public class GoalController {

  @Autowired
  private GoalService goalService;
  
  @RequestMapping(value = "addGoal", method = RequestMethod.GET)
  public String  addGoal(Model model) {
    Goal goal = new Goal();
    goal.setMinutes(10);
    model.addAttribute("goal", goal);
    return "addGoal";
  }
  
  @RequestMapping(value = "addGoal", method = RequestMethod.POST)
  public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
    System.out.println("Result has errors: " + result.hasErrors());
    
    System.out.println("Goal set: " + goal.getMinutes());
    
    if(result.hasErrors()) {
      return "addGoal";
    } else {
      goalService.save(goal);
    }
    
    return "redirect:index.jsp";
  }
  
  @RequestMapping(value = "getGoals", method = RequestMethod.GET)
  public String getGoals(Model model) {
    List<Goal> goals = goalService.findAllGoals();
    model.addAttribute("goals", goals);
    return "getGoals";
  }
  
  @RequestMapping(value = "getGoalReports", method = RequestMethod.GET)
  public String getGoalReports(Model model) {
    List<GoalReport> goalReports = goalService.findAllGoalReports();
    model.addAttribute("goalReports", goalReports);
    return "getGoalReports";
  }
  
}
