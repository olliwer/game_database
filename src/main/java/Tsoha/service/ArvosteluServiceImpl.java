package Tsoha.service;

import Tsoha.domain.Arvostelu;
import Tsoha.repository.ArvosteluRepository;
import Tsoha.repository.PeliRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Pessi
 */
@Service
public class ArvosteluServiceImpl implements ArvosteluService {

    @Autowired
    ArvosteluRepository arvosteluRepository;
    
    @Autowired
    PeliRepository peliRepository;

    @Transactional
    @Override
    public void remove(Arvostelu arvostelu) {
        arvostelu.getPeli().getArvostelut().remove(arvostelu);
        peliRepository.save(arvostelu.getPeli());
        arvostelu.setPeli(null);
        arvosteluRepository.delete(arvostelu);
    }

    @Override
    public List<Arvostelu> listAll() {
        return arvosteluRepository.findAll();
    }

    @Override
    public Arvostelu add(Arvostelu arvostelu) {
        return (arvosteluRepository.save(arvostelu));
    }
    @Override
    public Arvostelu findArvostelu(Integer arvosteluId) {
        return arvosteluRepository.findOne(arvosteluId);
    }
}