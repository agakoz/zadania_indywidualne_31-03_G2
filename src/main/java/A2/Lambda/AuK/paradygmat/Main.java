package A2.Lambda.AuK.paradygmat;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorted list by last name and name");

        List.of(
                new Person("Zuzia", "Kowalsa", true),
                new Person("Anna", "Kowalsa", false),
                new Person("Anna", "Ajdjsa", true),
                new Person("Jan", "Kowalsa", true)
        )
                .stream()
                .sorted(Person.sortByLastName.thenComparing(Person.sortByName))
                .forEach(System.out::println);


        System.out.println("List of persons with siblings");
        List.of(
                new Person("Zuzia", "Kowalsa", true),
                new Person("Anna", "Kowalsa", false),
                new Person("Anna", "Ajdjsa", true),
                new Person("Jan", "Kowalsa", true)
        )
                .stream()
                .filter(Person.hasSiblingsPredicate)
                .forEach(System.out::println);


        System.out.println("List of persons with name starts with B");
        List.of(
                new Person("Zuzia", "Kowalsa", true),
                new Person("Basia", "Kowalsa", false),
                new Person("Anna", "Ajdjsa", true),
                new Person("Jan", "Kowalsa", true)
        )
                .stream()
                .filter(Person.nameStartsBPredicate)
                .forEach(System.out::println);

    }


}

