package com.mundopelis.mundopelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundopelis.mundopelis.model.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
    
}
