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
public class PeliServiceImpl implements PeliService {

    @Autowired
    private PeliRepository peliRepository;
    
    @Autowired
    private GenreRepository genreRepository;
    
    @Override
    @Transactional
    public void saveOrUpdate(Peli peli, Long genreId) {
        Genre genre = genreRepository.findOne(genreId);
        genre.addPeli(peli);
        genreRepository.save(genre);
    }

    @Override
    @Transactional
    public List<Peli> listAll() {
        return peliRepository.findAll();
    }
    
    @Override
    @Transactional
    public Peli lisaa(Peli peli){
        return(peliRepository.save(peli));
    }
    
}
