package pl.sda.javastart.day5;

import java.util.Arrays;

public class StringExample {

    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null};

    public static void main(String[] args) {


        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            if(animal.length() <4) {
                System.out.println(animal);
            }
            System.out.println(animal);
        }

        Arrays.stream(animals)
                 .distinct()
                .filter(e-> e != null)
                .filter(e -> e.length() < 4)
                .forEach(e -> System.out.println(e));
    }

}
