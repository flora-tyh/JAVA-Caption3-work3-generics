package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class App {

    private static Object ArrayList;

    public static void main(String[] args) {
        Student student1 = new Student("3", "张三");
        Student student2 = new Student("4", "李四");
        Student student3 = new Student("5", "王五");
        Student student4 = new Student("6", "赵六");
        Student student5 = new Student("7", "钱七");
        Student student6 = new Student("5", "冯五");

        MemoryRepository memoryRepository = new MemoryRepository(new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5)));
        RepositoryUtil repositoryUtil = new RepositoryUtil();

        System.out.println(memoryRepository.get("3"));
        System.out.println("=========================");

        memoryRepository.delete("4");
        repositoryUtil.printList(memoryRepository.list());
        System.out.println("=========================");

        memoryRepository.update("5", student6);
        repositoryUtil.printList(memoryRepository.list());
    }
}
