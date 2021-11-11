package fr.rexdevoxx;

// > Java 17
public class MapMulti {

    public static void main(String[] args) {

        /*
         * - Première version avec filter + map avec deux fois le parseInt
         * - Deuxième version avec un flatMap et un return Stream.Empty() dans le catch
         * - Troisième version avec le mapMulti et un stream.accept
         */
        String numbers = """
                1
                2
                3
                4
                5
                # un commentaire
                6
                7
                8
                9
                10
                """;

        numbers.lines()
                .forEach(System.out::println);
    }

}
