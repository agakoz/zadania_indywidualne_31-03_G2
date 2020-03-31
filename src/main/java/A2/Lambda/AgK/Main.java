package A2.Lambda.AgK;

import java.util.List;

import static A2.Lambda.AgK.Person.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.");
        List<Person> people = List.of(
                new Person("Ala", "Zar", 2001),
                new Person("Basia", "Bela", 2016),
                new Person("Adam", "Berek", 1998),
                new Person("Zara", "Lok", 1923),
                new Person("Kamila", "Beza", 1972),
                new Person("Artur", "Rak", 1986),
                new Person("Laura", "Ad", 1965),
                new Person("Laura", "Koala", 1995),
                new Person("Ola", "Bela", 1963),
                new Person("Kora", "Berek", 1993),
                new Person("Ala", "Bala", 2006),
                new Person("Lamila", "Beza", 1967),
                new Person("Artur", "Anaś", 1993),
                new Person("Ania", "Zoler", 1995)
        );

        System.out.println("2.1");
        System.out.println("Alphabetically sorted names of participants," +
                " whose names stats with \"A\" and who were not born in 90:".toUpperCase());

        people
                .stream()
                .filter(ninetiesKid.negate().and(nameStartsWith("A")))
                .sorted(sortNames)
                .forEach(p-> System.out.println(p.getName()));

        System.out.println("______________");
        System.out.println("2.2");

        System.out.println("90' kids sorted by surnames reversed".toUpperCase());
        people
                .stream()
                .filter(ninetiesKid)
                .sorted(sortSurnames.reversed())
                .forEach(System.out::println);

        System.out.println("______________");
        System.out.println("2.3");
        System.out.println("age of ppl whose name starts with L sorded by age".toUpperCase());
        people
                .stream()
                .filter(nameStartsWith("L"))
                .sorted(sortYearsOfBirth)
                .forEach(p -> System.out.println(p.getName() + ": " + (2020 - p.getYearOfBirth())));
    }

}
