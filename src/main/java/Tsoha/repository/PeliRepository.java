/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.repository;

import Tsoha.domain.Peli;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Noemj
 */


public interface PeliRepository extends JpaRepository<Peli, Long> {
    
}