package com.mundopelis.mundopelis.services.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mundopelis.mundopelis.model.Genre;
import com.mundopelis.mundopelis.repository.GenreRepository;
import com.mundopelis.mundopelis.services.interfaces.IGenreService;

@Service
public class GenreServiceImpl implements IGenreService{

    private final GenreRepository genreRepository; 

    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Genre> getAll() {
        return genreRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Genre getById(Long id) {
        return genreRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro el genero: "+ id));
    }

    @Override
    @Transactional
    public Genre create(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    @Transactional
    public Genre update(Genre genre, Long id) {
        Genre genrePersist = getById(id);
        BeanUtils.copyProperties(genre, genrePersist, "id");
        return create(genre);  
    }

    @Override
    @Transactional
    public void deleteById(Long id) { 
        getById(id);
        genreRepository.deleteById(id);
    }

    @Override
    public List<Genre> getAllByIds(List<Long> ids) {
        return genreRepository.findAllById(ids);
    }
    
}
