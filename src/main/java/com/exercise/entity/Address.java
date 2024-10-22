package com.exercise.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private long addressId;
  private String address;
  private String address2;
  private String district;
  private long cityId;
  private String postalCode;
  private String phone;
  private String location;
  private java.sql.Timestamp lastUpdate;
}
