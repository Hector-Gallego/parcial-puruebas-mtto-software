package com.mundopelis.mundopelis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mundopelis.mundopelis.model.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    
}
