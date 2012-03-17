/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Peli;
import java.util.List;

/**
 *
 * @author Noemj
 */
public interface PeliService {
    public void saveOrUpdate(Peli peli, Long genreId);
    public List<Peli> listAll();
}
