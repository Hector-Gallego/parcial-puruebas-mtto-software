package com.mundopelis.mundopelis.controller;

import com.mundopelis.mundopelis.model.Genre;
import com.mundopelis.mundopelis.services.interfaces.IGenreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GenreControllerTest {

    @Mock
    private IGenreService genreService;

    @InjectMocks
    private GenreController genreController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllGenres() {

        // Mocking
        List<Genre> genres = Arrays.asList(new Genre(), new Genre());
        when(genreService.getAll()).thenReturn(genres);

        // Test
        ResponseEntity<List<Genre>> response = genreController.getAllGenres();

        // Verificación
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(genres, response.getBody());
    }

    @Test
    void getGenreById() {
        // Mocking
        Long genreId = 1L;
        Genre genre = new Genre();
        when(genreService.getById(genreId)).thenReturn(genre);

        // Test
        ResponseEntity<Genre> response = genreController.getGenreById(genreId);

        // Verificación
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(genre, response.getBody());
    }

    @Test
    void createGenre() {

        // Mocking
        Genre genreToCreate = new Genre();
        when(genreService.create(genreToCreate)).thenReturn(genreToCreate);

        // Test
        ResponseEntity<Genre> response = genreController.createGenre(genreToCreate);

        // Verificación
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(genreToCreate, response.getBody());
    }

    @Test
    void updateGenre() {
        // Mocking
        Long genreId = 1L;
        Genre updatedGenre = new Genre();
        when(genreService.update(updatedGenre, genreId)).thenReturn(updatedGenre);

        // Test
        ResponseEntity<Genre> response = genreController.updateGenre(updatedGenre, genreId);

        // Verificación
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(updatedGenre, response.getBody());
    }

    @Test
    void deleteGenre() {
        // Test
        ResponseEntity<Object> response = genreController.deleteGenre(1L);

        // Verificación
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(genreService, times(1)).deleteById(1L);
    }
}