package A2.Lambda.AgK;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Person {
    String name;
    String surname;
    int yearOfBirth;

    static Predicate<Person> nameStartsWith(final String firstLetter) {
        return p -> p.name.startsWith(firstLetter);
    }

    static Predicate<Person> surnameStartsWith(final String firstLetter) {
        return p -> p.surname.startsWith(firstLetter);
    }

    static Predicate<Person> ninetiesKid = p -> p.yearOfBirth >= 1990 && p.yearOfBirth < 2000;

    static Comparator<Person> sortNames = Comparator.comparing(p -> p.name);
    static Comparator<Person> sortSurnames = Comparator.comparing(p -> p.surname);
    static Comparator<Person> sortYearsOfBirth = Comparator.comparing(p -> p.yearOfBirth);


}
