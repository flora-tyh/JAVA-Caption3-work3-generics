package com.thoughtworks;

import java.util.List;

public class RepositoryUtil {
    public static <E> void printList(List<E> list) {
        for (E e : list) {
            System.out.println(e);
        }
    }
}
