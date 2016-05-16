package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class ExamResult extends BaseEntity {

  @Column(name = "EXAM_DATE")
  @Temporal(TemporalType.DATE)
  private Date examData;
  
  private int mark;
  
  @Transient
  private String examLocation;
}
