/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.repository;

import Tsoha.domain.Peli;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Noemj
 */
@Transactional
public interface PeliRepository extends JpaRepository<Peli, Integer> {
   List<Peli> findByLainassa(String lainassa);
}
