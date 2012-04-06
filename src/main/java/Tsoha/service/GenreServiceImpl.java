/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Genre;
import Tsoha.repository.GenreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noemj
 */

@Service
public class GenreServiceImpl implements GenreService{

    @Autowired
    GenreRepository genreRepository;
    
    @Override
    public void remove(Genre genre) {
        genreRepository.delete(genre);
    }

    @Override
    public List<Genre> listAll() {
        return genreRepository.findAll();
    }

    @Override
    public Genre add(Genre genre) {
        return(genreRepository.save(genre));
    }
    
    
}
