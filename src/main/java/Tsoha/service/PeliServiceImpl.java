/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Peli;
import Tsoha.repository.PeliRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noemj
 */

@Service
public class PeliServiceImpl implements PeliService {
    
    @Autowired
    PeliRepository peliRepository;

    @Override
    public void remove(Peli peli) {
        peliRepository.delete(peli);
    }

    @Override
    public List<Peli> listAll() {
        return peliRepository.findAll();
    }

    @Override
    public Peli add(Peli peli) {
        return(peliRepository.save(peli));
    }
    
}
