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
    public void remove(Peli peli);
    public List<Peli> listAll();
    public Peli add(Peli peli);
}
