package com.thoughtworks;

public interface Repository<E> {
    void save(E name, E student);
    Student get(E id);
    void delete(E id);
    void update(E id, E student);
    void list();
}
