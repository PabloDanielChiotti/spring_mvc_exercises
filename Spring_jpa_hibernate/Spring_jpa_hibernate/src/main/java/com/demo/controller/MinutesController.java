package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Exercise;
import com.demo.model.Goal;
import com.demo.service.Activity;
import com.demo.service.ExerciseService;

@Controller
public class MinutesController {

  @Autowired
  private ExerciseService exerciseService;

  @RequestMapping(value = "/addMinutes", method = RequestMethod.GET)
  public String getMinutes(@ModelAttribute("exercise") Exercise exercise) {
    return "addMinutes";
  }

  /**
   * Para tener en cuenta, cuando ponemos en los parametros BindingResult, siempre tiene que estar a
   * continuacion del @ModelAttribute sino tira el siguiente error: Errors/BindingResult argument
   * declared without preceding model attribute
   */
  @RequestMapping(value = "/addMinutes", method = RequestMethod.POST)
  public String addMinutes(@Valid @ModelAttribute("exercise") Exercise exercise,
      BindingResult result, HttpSession session) {
    System.out.println("exercise: " + exercise.getMinutes());
    System.out.println("exercise activity: " + exercise.getActivity());

    if (result.hasErrors()) {
      return "addMinutes";
    } else {
      
      /**
       * tomamos de la session el atributo "goal", es por esto que cuando guardemos los minutos que
       * se le asignaron a una actividad, lo asocia al goal que metimos antes. para mas informacion
       * leer el goal controller donde se explica esto un poquito mas, sino ver el video nro 37.
       * many to one demo.
       */
      Goal goal = (Goal) session.getAttribute("goal");
      exercise.setGoal(goal);
      exerciseService.save(exercise);
    }

    return "addMinutes";
  }

  @RequestMapping(value = "/activities", method = RequestMethod.GET)
  public @ResponseBody List<Activity> findAllActivities() {
    return exerciseService.findAllActivities();
  }

}
