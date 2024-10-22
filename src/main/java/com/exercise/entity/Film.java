package com.exercise.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {

  private long filmId;
  private String title;
  private String description;
  private String releaseYear;
  private long languageId;
  private long originalLanguageId;
  private long rentalDuration;
  private double rentalRate;
  private long length;
  private double replacementCost;
  private String rating;
  private String specialFeatures;
  private java.sql.Timestamp lastUpdate;


}