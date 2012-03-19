/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.repository;

import Tsoha.domain.Peli;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Noemj
 */

public interface PeliRepository extends JpaRepository<Peli, Long> {
    List<Peli> findPeli();
}
