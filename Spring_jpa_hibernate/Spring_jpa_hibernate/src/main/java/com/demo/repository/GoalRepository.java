package com.demo.repository;

import java.util.List;

import com.demo.model.Goal;
import com.demo.model.GoalReport;

public interface GoalRepository {

  Goal save(Goal goal);
  
  List<Goal> loadAll();
  
  List<GoalReport> findAllGoalReports();
  
}