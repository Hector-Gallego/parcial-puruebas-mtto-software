package com.mundopelis.mundopelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundopelis.mundopelis.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    
}
