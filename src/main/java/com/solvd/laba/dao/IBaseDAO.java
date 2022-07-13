package com.solvd.laba.dao;

public interface IBaseDAO<T> {
    T getEntityById(int id);

    void createEntity(T entity);

    void updateEntity(T entity);

    void removeEntity(int id);
}
