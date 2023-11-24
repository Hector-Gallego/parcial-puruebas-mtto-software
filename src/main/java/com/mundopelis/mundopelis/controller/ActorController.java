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

import com.mundopelis.mundopelis.model.Actor;
import com.mundopelis.mundopelis.services.interfaces.IActorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

private final IActorService actorService;

public ActorController(IActorService actorService) {
    this.actorService = actorService;
}

@GetMapping
public ResponseEntity<List<Actor>> getAllActors(){
    return new ResponseEntity<List<Actor>>(actorService.getAll(), HttpStatus.OK);
}

@GetMapping("/{id}")
public ResponseEntity<Actor> getActorById(@PathVariable Long id){
    return new ResponseEntity<Actor>(actorService.getById(id), HttpStatus.OK);
}

@PostMapping
public ResponseEntity<Actor> createActor(@Valid @RequestBody Actor actor){
    return new ResponseEntity<Actor>(actorService.create(actor), HttpStatus.OK);
}

@PutMapping("/{id}")
public ResponseEntity<Actor> updateActor(@Valid @RequestBody Actor actor, @PathVariable Long id){
    return new ResponseEntity<Actor>(actorService.update(actor, id), HttpStatus.OK);
}

@DeleteMapping("/{id}")
public ResponseEntity<Object> deleteActor(@PathVariable Long id){
    actorService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}


    
}
