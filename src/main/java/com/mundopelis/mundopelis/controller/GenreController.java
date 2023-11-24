package com.mundopelis.mundopelis.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mundopelis.mundopelis.model.Genre;
import com.mundopelis.mundopelis.services.interfaces.IGenreService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/genres")
public class GenreController {

    private final IGenreService genreService;

    public GenreController(IGenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping
    public ResponseEntity<List<Genre>> getAllGenres() {
        return new ResponseEntity<List<Genre>>(genreService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable Long id) {
        return new ResponseEntity<Genre>(genreService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Genre> createGenre(@Valid @RequestBody Genre genre) {
        return new ResponseEntity<Genre>(genreService.create(genre), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateGenre(@Valid @RequestBody Genre genre, @PathVariable Long id) {
        return new ResponseEntity<Genre>(genreService.update(genre, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteGenre(@PathVariable Long id) {
        genreService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
