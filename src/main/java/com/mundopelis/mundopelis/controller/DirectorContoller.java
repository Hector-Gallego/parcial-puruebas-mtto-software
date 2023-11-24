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

import com.mundopelis.mundopelis.model.Director;
import com.mundopelis.mundopelis.services.interfaces.IDirectorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/directors")

public class DirectorContoller {

    private final IDirectorService directorService;

    public DirectorContoller(IDirectorService directorService) {
        this.directorService = directorService;
    }


    @GetMapping
    public ResponseEntity<List<Director>> getAllDirectors() {
        return new ResponseEntity<List<Director>>(directorService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Director> getDirectorById(@PathVariable Long id) {
        return new ResponseEntity<Director>(directorService.getById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Director> createDirector(@Valid @RequestBody Director director) {
        return new ResponseEntity<Director>(directorService.create(director), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Director> updateDirector(@Valid @RequestBody Director director, @PathVariable Long id) {
        return new ResponseEntity<Director>(directorService.update(director, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteDirector(@PathVariable Long id) {
        directorService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
