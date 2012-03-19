/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Genre;
import java.util.List;

public interface GenreService {
    
    public void saveOrUpdate(Genre genre, Long peliId);
    public List<Genre> listAll();
    public Genre add(Genre genre);
}
