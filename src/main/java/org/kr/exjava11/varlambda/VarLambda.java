package main.java.org.kr.exjava11.varlambda;

import java.util.Map;

public class VarLambda {

    public static void main(String[] args) {
        final var list = Map.of(1,"A",2,"BB", 3, "CCC");
        list.forEach((var k, var v) -> System.out.println(k + " " + v));
    }
}
