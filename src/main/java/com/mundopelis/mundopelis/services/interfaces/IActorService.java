package com.mundopelis.mundopelis.services.interfaces;

import java.util.List;

import com.mundopelis.mundopelis.model.Actor;

public interface IActorService {

    List<Actor> getAll();
    Actor getById(Long id);
    Actor update(Actor actor, Long id);
    Actor create(Actor actor);
    void deleteById(Long id);
    List<Actor> getAllByIds(List<Long> ids);
    
}
