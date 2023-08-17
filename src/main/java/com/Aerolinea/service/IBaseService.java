package com.Aerolinea.service;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T,Y> {
    
    //Esta es la base para los cruds
    List<T> getAll();

    T save(T item);

    void delete(T item);

    Optional<T> getById(Y id);
}
