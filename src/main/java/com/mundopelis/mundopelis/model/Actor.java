package com.mundopelis.mundopelis.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "actors")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
    private String names;
    @NotNull
    private Integer age;
    
  
   

    @ManyToMany(mappedBy = "actors")
    @JsonIgnore
    private List<Movie> movies = new ArrayList<>();
   


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNames() {
        return names;
    }
    public void setNames(String nombres) {
        this.names = nombres;
    }
   
    public List<Movie> getMovies() {
        return movies;
    }
    public void setMovies(List<Movie> peliculas) {
        this.movies = peliculas;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    } 

    
    
}
