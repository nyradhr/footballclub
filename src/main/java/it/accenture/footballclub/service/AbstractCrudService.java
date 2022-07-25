package it.accenture.footballclub.service;

import it.accenture.footballclub.exception.EntityNotFoundException;

import java.util.Optional;

public interface AbstractCrudService<T, K> {

    Iterable<T> getAll();
    Optional<T> findById(K k);
    void deleteById(K k) throws EntityNotFoundException;
    T saveOrUpdate(T t) throws EntityNotFoundException;
    boolean exists(K id);
}
