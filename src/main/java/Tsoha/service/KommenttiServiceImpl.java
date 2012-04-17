/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Kommentti;
import Tsoha.repository.KommenttiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class KommenttiServiceImpl implements KommenttiService {

    @Autowired
    KommenttiRepository kommenttiRepository;

    @Override
    public void remove(Kommentti kommentti) {
        kommenttiRepository.delete(kommentti);
    }

    @Override
    public List<Kommentti> listAll() {
        return kommenttiRepository.findAll();
    }

    @Override
    public Kommentti add(Kommentti kommentti) {
        return (kommenttiRepository.save(kommentti));
    }
    
    @Override
    public Kommentti findKommentti(Integer id){
        return (kommenttiRepository.findOne(id));
    }
}
