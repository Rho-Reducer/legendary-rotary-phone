package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;

@Entity
@Table(name="Articles")
@Data
public class Article {
  
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column
  private long id;

  @Column
  @NonNull
  private String title;
  
  @Column
  private String summary;
  
  @Column
  @NonNull
  private String content;
  
  public Article() {
    title = "";
    content = "";
  }
}
