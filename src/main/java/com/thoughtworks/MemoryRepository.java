package com.thoughtworks;

import java.util.ArrayList;
import java.util.Iterator;

public class MemoryRepository implements Repository {
    private ArrayList<Student> students;

    public MemoryRepository() {
    }

    public MemoryRepository(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void save(Object id, Object student) {
        if (student instanceof Student) {
            Student realStudent = (Student) student;
            students.add(realStudent);
        }
    }

    @Override
    public Student get(Object id) {
        if (id instanceof String) {
            String realId = (String) id;
            for (Student student : students) {
                if (student.getId().equals(realId)) {
                    return student;
                }
            }
        }
        return null;
    }

    @Override
    public void delete(Object id) {
        if (id instanceof String) {
            String realId = (String) id;
            for (Iterator<Student> it = students.iterator(); it.hasNext();) {
                if (it.next().getId().equals(realId)) {
                    it.remove();
                }
            }
        }
    }

    @Override
    public void update(Object id, Object student) {
        this.delete(id);
        if (student instanceof Student) {
            Student realStudent = (Student) student;
            students.add(realStudent);
        }
    }

    @Override
    public void list() {
        RepositoryUtil repositoryUtil = new RepositoryUtil();
        repositoryUtil.printList(students);
    }
}
