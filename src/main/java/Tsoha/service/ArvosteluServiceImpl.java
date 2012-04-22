package Tsoha.service;

import Tsoha.domain.Arvostelu;
import Tsoha.repository.ArvosteluRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pessi
 */
@Service
public class ArvosteluServiceImpl implements ArvosteluService {

    @Autowired
    ArvosteluRepository arvosteluRepository;

    @Override
    public void remove(Arvostelu arvostelu) {
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