package Tsoha.repository;

import Tsoha.domain.Arvostelu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pessi
 */
public interface ArvosteluRepository extends JpaRepository<Arvostelu, Integer> {
}
