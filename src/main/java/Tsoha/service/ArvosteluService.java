package Tsoha.service;

/**
 *
 * @author Pessi
 */
import Tsoha.domain.Arvostelu;
import java.util.List;

public interface ArvosteluService {
  
    public void remove(Arvostelu arvostelu);
    public List<Arvostelu> listAll();
    public Arvostelu add(Arvostelu arvostelu);
}
