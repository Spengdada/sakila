package com.exercise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "actor")
public class Actor {

  @Id
  @TableId(type = IdType.AUTO)//自增长
  private long actorId;


  private String firstName;
  private String lastName;
  private java.sql.Timestamp lastUpdate;

}
