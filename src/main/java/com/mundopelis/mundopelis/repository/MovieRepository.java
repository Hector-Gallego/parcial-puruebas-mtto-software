package com.mundopelis.mundopelis.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundopelis.mundopelis.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findByName(String name);
    List<Movie> findByNameContainingIgnoreCase(String term);

}
