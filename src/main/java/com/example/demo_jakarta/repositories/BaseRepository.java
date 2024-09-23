package com.example.demo_jakarta.repositories;


import java.util.List;
import java.util.Optional;

public interface BaseRepository<TEntity, Tid> {

    TEntity save(TEntity entity);
    Optional<TEntity> findById(Tid id);
    List<TEntity> findAll();
    void deleteById(Tid id);
    void update(TEntity entity);

}
