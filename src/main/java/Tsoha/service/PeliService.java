/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Peli;
import Tsoha.domain.Kommentti;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.security.access.prepost.PreAuthorize;

/**
 *
 * @author Noemj
 */
public interface PeliService {

    @PreAuthorize("hasRole('master')")
    public void remove(Peli peli) throws DataAccessException;

    public List<Peli> listAll();

    @PreAuthorize("hasRole('user') or hasRole('master')")
    public Peli add(Peli peli) throws DataAccessException;

    @PreAuthorize("hasRole('user') or hasRole('master')")
    public Peli findPeli(Integer peliId) throws DataAccessException;

    public List<Peli> findByLainassa(String lainassa);
}
