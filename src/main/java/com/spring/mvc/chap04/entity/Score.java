package com.spring.mvc.chap04.entity;

import lombok.*;

@Setter @Getter @ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class Score {
  private String name;
  private int kor,eng,math;
  private int stuNum;

  private int total;
  private double average;
  private Grade grade;
}
