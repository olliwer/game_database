/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Genre;
import Tsoha.domain.Peli;
import Tsoha.repository.GenreRepository;
import Tsoha.repository.PeliRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Noemj
 */
@Service
public class GenreServiceImpl implements GenreService {
    
    @Autowired
    private PeliRepository peliRepository;
    
    @Autowired
    private GenreRepository genreRepository;

    
    @Override
    @Transactional
    public void saveOrUpdate(Genre genre, Long peliId) {
        Peli p =  peliRepository.findOne(peliId);
        
    }

    @Override
    @Transactional
    public List<Genre> listAll() {
        return genreRepository.findAll();
    }
    
    
}
