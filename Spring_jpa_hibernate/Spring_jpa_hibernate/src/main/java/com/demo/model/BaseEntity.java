package com.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  protected Long id;
  
  public Long getId() {
    return this.id;
  }
  
}
