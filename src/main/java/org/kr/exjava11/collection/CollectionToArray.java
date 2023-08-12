package main.java.org.kr.exjava11.collection;

import java.util.List;

public class CollectionToArray {

    public static void main(String[] args) {
        final var list = List.of(1,2,3);
        final var array = list.toArray(Integer[]::new);
        for (final var value : array) {
            System.out.println(value);
        }
    }
}
