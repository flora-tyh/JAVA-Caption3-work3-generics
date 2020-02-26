package com.thoughtworks;

import java.util.ArrayList;

public interface Repository<E> {
    void save(String name, E student);
    Student get(String id);
    void delete(String id);
    void update(String id, E student);
    ArrayList<E> list();
}
