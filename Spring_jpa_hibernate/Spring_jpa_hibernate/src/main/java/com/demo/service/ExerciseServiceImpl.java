package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Exercise;
import com.demo.repository.ExerciseRepository;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

  @Autowired
  private ExerciseRepository exerciseRepository;
  
  @Override
  public List<Activity> findAllActivities() {

    List<Activity> activities = new ArrayList<Activity>();
    
    Activity run = new Activity();
    run.setDescription("Run");
    activities.add(run);

    Activity bike = new Activity();
    bike.setDescription("Bike");
    activities.add(bike);
    
    Activity swim = new Activity();
    swim.setDescription("Swim");
    activities.add(swim);
    
    return activities;
  }

  @Override
  @Transactional
  public Exercise save(Exercise exercise) {
    exercise = exerciseRepository.save(exercise);
    //is the same object for now.
    return exercise;
  }

}
