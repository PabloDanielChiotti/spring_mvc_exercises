package com.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "table_goal") //Le setea el nombre a la tabla.
@NamedQueries({
  @NamedQuery(name = Goal.FIND_GOAL_REPORTS, query = "Select new com.demo.model.GoalReport(g.minutes, e.minutes, e.activity)"
      + "from Goal g, Exercise e where g.id = e.goal.id"),
  @NamedQuery(name = Goal.FIND_ALL_GOALS, query = "select g from Goal g")
})
public class Goal {

  public static final String FIND_GOAL_REPORTS = "findGoalReports";
  public static final String FIND_ALL_GOALS = "findAllGoals";
  
  @Id
  @GeneratedValue
  @Column(name = "GOAL_ID")
  private Long id;

  @Range(min = 1, max = 120)
  @Column(name = "MINUTES")
  private int minutes;
  
  /**
   * video nro 38, 39, 40, 41 y 42 explican como si queremos traer la pagina
   * http://localhost:8080/Spring_jpa_hibernate/getGoals.html
   * y tenemos FetchType.EAGER funciona todo correctamente pero si tenemos 
   * FetchType.LAZY falla tirando como error:
   * org.hibernate.LazyInitializationException: failed to lazily initialize a 
   * collection of role: com.demo.model.Goal.exercises, could not initialize proxy - no Session
   * Para arreglar esto hay que agregar en el web.xml el filtro
   * OpenEntityManagerInViewFilter.
   */
  @OneToMany(mappedBy = "goal", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private List<Exercise> exercises = new ArrayList<Exercise>();
  
  public List<Exercise> getExercises() {
    return exercises;
  }

  public void setExercises(List<Exercise> exercises) {
    this.exercises = exercises;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public int getMinutes() {
    return minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }
  
}
