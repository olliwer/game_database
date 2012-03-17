/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.repository;

import Tsoha.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Noemj
 */
public interface GenreRepository extends JpaRepository<Genre, Long> {
    
}
