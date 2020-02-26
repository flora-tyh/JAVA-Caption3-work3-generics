package com.thoughtworks;

import java.util.ArrayList;
import java.util.Iterator;

public class MemoryRepository<E> implements Repository<E> {
    private ArrayList<E> students;

    public MemoryRepository() {
    }

    public MemoryRepository(ArrayList<E> students) {
        this.students = students;
    }

    public ArrayList<E> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<E> students) {
        this.students = students;
    }

    @Override
    public void save(String id, E student) {
        students.add(student);
    }

    @Override
    public Student get(String id) {
        for (E student : students) {
            if (student instanceof Student) {
                Student stu = (Student) student;
                if (stu.getId().equals(id)) {
                    return stu;
                }
            }

        }
        return null;
    }

    @Override
    public void delete(String id) {
        int num = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) instanceof Student) {
                Student stu = (Student) students.get(i);
                if (stu.getId() == id) {
                    num = i;
                }
            }
        }
        students.remove(num);
    }

    @Override
    public void update(String id, E student) {
        this.delete(id);
            students.add(student);
    }

    @Override
    public ArrayList<E> list() {
        return students;
    }
}
