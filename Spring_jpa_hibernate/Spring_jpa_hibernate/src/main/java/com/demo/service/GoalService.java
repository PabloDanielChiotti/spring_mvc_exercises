package com.demo.service;

import java.util.List;

import com.demo.model.Goal;
import com.demo.model.GoalReport;

public interface GoalService {

  Goal save(Goal goal);
  
  List<Goal> findAllGoals();
  
  List<GoalReport> findAllGoalReports();
  
}
