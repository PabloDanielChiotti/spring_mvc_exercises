package com.demo.service;

import java.util.List;

import com.demo.model.Exercise;

public interface ExerciseService {

  List<Activity> findAllActivities();
  
  Exercise save(Exercise exercise);

}
