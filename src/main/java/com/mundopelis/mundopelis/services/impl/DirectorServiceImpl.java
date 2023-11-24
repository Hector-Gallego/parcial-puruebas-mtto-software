package com.mundopelis.mundopelis.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mundopelis.mundopelis.model.Director;
import com.mundopelis.mundopelis.repository.DirectorRepository;
import com.mundopelis.mundopelis.services.interfaces.IDirectorService;

@Service
public class DirectorServiceImpl implements IDirectorService {

    private final DirectorRepository directorRepository;
    public DirectorServiceImpl(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Director> getAll() {

        return directorRepository.findAll();
        
    }

    @Override
    @Transactional(readOnly = true)
    public Director getById(Long id) {
        return directorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el dierector: " +id));
    }

    @Override
    @Transactional
    public Director create(Director director) {
        return directorRepository.save(director);
    }

    @Override
    @Transactional
    public Director update(Director director, Long id) {
        
        Director directorPersist = getById(id);
        BeanUtils.copyProperties(directorPersist, director, "id");
        return create(directorPersist);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(Long id) {
        getById(id);
        directorRepository.deleteById(id);
    }
    
}
