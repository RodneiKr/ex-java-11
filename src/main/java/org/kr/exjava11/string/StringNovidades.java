package main.java.org.kr.exjava11.string;

public class StringNovidades {

    public static void main(String[] args) {

        cabecalho("String.isBlank()");
        final var espacos = "     ";
        System.out.println("isBalnk: \"" + espacos + "\" " + espacos.isBlank());
        System.out.println("isEmpty: \"" + espacos + "\" " + espacos.isEmpty());

        cabecalho("String.lines()");
        final var lines = "java\n11\nShow!!!";
        lines.lines().forEach(System.out::println);

        cabecalho("String.strip() (nao usar mais o trim())");
        final var strip = "   Java 11 Show!!!   ";
        System.out.println("strip:         \"" + strip + "\" -> " + "\"" + strip.strip() + "\"");
        System.out.println("stripLeading:  \"" + strip + "\" -> " + "\"" + strip.stripLeading() + "\"");
        System.out.println("stripTrailing: \"" + strip + "\" -> " + "\"" + strip.stripTrailing() + "\"");

    }

    private static void cabecalho(final String cabecalho) {
        final var linha = "-".repeat(cabecalho.length());
        System.out.println();
        System.out.println(linha);
        System.out.println(cabecalho);
        System.out.println(linha);
    }
}
