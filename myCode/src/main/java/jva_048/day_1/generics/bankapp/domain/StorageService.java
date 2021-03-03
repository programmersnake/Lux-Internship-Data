package jva_048.day_1.generics.bankapp.domain;

import java.util.List;

public interface StorageService<T> {
    T store(T object);

    T getById(int id);

    T update(T toUpdate);

    void delete(T object);

    List<T> getAll();
}
