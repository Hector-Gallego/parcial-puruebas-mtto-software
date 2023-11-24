package com.mundopelis.mundopelis.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @NotEmpty
    private String name;
    @Column(columnDefinition = "TEXT")
    @NotEmpty
    private String description;
    @NotEmpty
    @Column(columnDefinition = "TEXT") 
    private String url;

    

    @ManyToMany
    @JoinTable(name = "movies_as_actors", 
        joinColumns = @JoinColumn(name = "movie_id"), 
        inverseJoinColumns = @JoinColumn(name = "actor_id"),
        uniqueConstraints = @UniqueConstraint(
            name = "uk_movie_actor", 
            columnNames = {"movie_id", "actor_id"}))
    @JsonProperty("actors")
    @NotNull
    private List<Actor> actors = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "movies_as_genres", 
        joinColumns = @JoinColumn(name = "movie_id"), 
        inverseJoinColumns = @JoinColumn(name = "genre_id"),
        uniqueConstraints = @UniqueConstraint(
            name = "uk_movie_genre", 
            columnNames = {"movie_id", "genre_id"}))
    @NotNull
    private List<Genre> genres = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "fk_director_id", nullable = false)
    @NotNull
    private Director director;

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripcion) {
        this.description = descripcion;
    }

 

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actores) {
        this.actors = actores;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> generos) {
        this.genres = generos;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
