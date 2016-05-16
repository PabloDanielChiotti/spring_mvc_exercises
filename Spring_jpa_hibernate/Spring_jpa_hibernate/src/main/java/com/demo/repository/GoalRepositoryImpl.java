package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.demo.model.Goal;
import com.demo.model.GoalReport;

/**
 * El repository es lo mismo que un DAO.
 */
@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

  @PersistenceContext
  private EntityManager em;
  
  @Override
  public Goal save(Goal goal) {
    
    em.persist(goal);
    
    em.flush();
    
    // retornamos el goal ya que el metodo persist retorna void, despues lo vamos a cambiar.
    return goal;
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public List<Goal> loadAll() {
    //Goal es el nombre del objecto (entity). NO el de la tabla que es table_goal.
    //esto es JPQL.
    //option 1
    //    Query query = em.createQuery("select g from Goal g");
    
    //option 2
    TypedQuery<Goal> query = em.createNamedQuery(Goal.FIND_ALL_GOALS, Goal.class);
    List goals = query.getResultList();
    
    return goals;
  }
  
  @SuppressWarnings({"rawtypes", "unchecked"})
  @Override
  public List<GoalReport> findAllGoalReports() {
    //option 1
//    Query query = em.createQuery("Select new com.demo.model.GoalReport(g.minutes, e.minutes, e.activity)"
//        + "from Goal g, Exercise e where g.id = e.goal.id");
    
    //option 2
    TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
    
    List goals = query.getResultList();
    return goals;
  }

}
