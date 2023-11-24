package com.mundopelis.mundopelis.services.interfaces;

import java.util.List;

import com.mundopelis.mundopelis.model.Director;


public interface IDirectorService {

    List<Director> getAll();
    Director getById(Long id);
    Director create(Director director);
    Director update(Director director, Long id);
    void deleteById(Long id);
    
}
