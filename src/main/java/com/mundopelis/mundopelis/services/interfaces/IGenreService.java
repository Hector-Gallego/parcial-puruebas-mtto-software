package com.mundopelis.mundopelis.services.interfaces;

import java.util.List;
import com.mundopelis.mundopelis.model.Genre;

public interface IGenreService {
    
    List<Genre> getAll();
    Genre getById(Long id);
    Genre create(Genre genre);
    Genre update(Genre genre, Long id);
    void deleteById(Long id);
    List<Genre> getAllByIds(List<Long> ids);
}
