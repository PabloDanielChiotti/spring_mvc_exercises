package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Goal;
import com.demo.model.GoalReport;
import com.demo.repository.GoalRepository;

@Service("goalService")
public class GoalServiceImpl implements GoalService {

  @Autowired
  private GoalRepository goalRepository;
  
  @Override
  @Transactional
  public Goal save(Goal goal) {
    return goalRepository.save(goal);
  }

  @Override
  public List<Goal> findAllGoals() {
    return goalRepository.loadAll();
  }

  @Override
  public List<GoalReport> findAllGoalReports() {
    return goalRepository.findAllGoalReports();
  }
  
}
