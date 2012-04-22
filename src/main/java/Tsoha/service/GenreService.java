/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Genre;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.security.access.prepost.PreAuthorize;

public interface GenreService {

    @PreAuthorize("hasRole('master')")
    public void remove(Genre genre) throws DataAccessException;

    public List<Genre> listAll();

    public Genre add(Genre genre);
    
    public Genre findGenre(Integer genreId);
}
