package com.mundopelis.mundopelis.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mundopelis.mundopelis.model.Actor;
import com.mundopelis.mundopelis.repository.ActorRepository;
import com.mundopelis.mundopelis.services.interfaces.IActorService;

@Service
public class ActorServiceImpl implements IActorService {

    private final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Actor> getAll() {
        return actorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Actor getById(Long id) {
        return actorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el actor: "+ id));
    }

    @Override
    @Transactional
    public Actor update(Actor actor, Long id) {

        Actor actorPersist = getById(id);
        BeanUtils.copyProperties(actorPersist, actor, "id");
        return create(actorPersist);
        
    }

    @Override
    @Transactional
    public Actor create(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        getById(id);
        actorRepository.deleteById(id);
    }

    @Override
    public List<Actor> getAllByIds(List<Long> ids) {
        return actorRepository.findAllById(ids);
    }
    
}
