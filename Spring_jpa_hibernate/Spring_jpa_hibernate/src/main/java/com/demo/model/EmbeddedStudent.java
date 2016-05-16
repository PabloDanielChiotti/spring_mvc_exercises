package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Entity
public class EmbeddedStudent extends BaseEntity {

  @Column(name = "matrikelNumber", unique = true)
  private String registrationNumber;
  
  private String name;
  
  @Embedded
  private EmbeddedScholarship scholarship;
  
  @Transient
  private Date loginTime;
  
}
