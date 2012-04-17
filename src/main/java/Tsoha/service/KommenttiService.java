/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.service;

import Tsoha.domain.Kommentti;
import java.util.List;

public interface KommenttiService {
        
    public void remove(Kommentti kommentti);
    public List<Kommentti> listAll();
    public Kommentti add(Kommentti kommentti);
    public Kommentti findKommentti(Integer id);
}
