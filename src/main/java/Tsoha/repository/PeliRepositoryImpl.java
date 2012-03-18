/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.repository;

import Tsoha.domain.Peli;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Noemj
 */
@Repository
public class PeliRepositoryImpl implements PeliRepository {

    @PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public List<Peli> findAll() {
        return entityManager.find(null, this);
    }

    @Override
    public List<Peli> findAll(Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Peli> save(Iterable<? extends Peli> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void flush() {
        entityManager.flush();
    }

    @Override
    public Peli saveAndFlush(Peli t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteInBatch(Iterable<Peli> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Page<Peli> findAll(Pageable pgbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Peli save(Peli t) {
        entityManager.
    }

    @Override
    public Peli findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean exists(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Peli t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Iterable<? extends Peli> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
