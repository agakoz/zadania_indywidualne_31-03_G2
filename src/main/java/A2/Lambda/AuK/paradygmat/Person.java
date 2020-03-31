package A2.Lambda.AuK.paradygmat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.function.Predicate;

@Data
@AllArgsConstructor
public class Person {
    String name;
    String lastName;
    boolean hasSiblings;

    static Predicate<Person> nameStartsBPredicate = person -> person.getName()
            .toUpperCase()
            .startsWith("B");

    static Predicate<Person> lastNameStartsKPredicate = person -> person.getLastName()
            .toUpperCase()
            .startsWith("B");

    static Predicate<Person> hasSiblingsPredicate = person -> person.isHasSiblings();

    static Comparator<Person> sortByLastName = Comparator.comparing(Person::getLastName);
    static Comparator<Person> sortByName = Comparator.comparing(Person::getName);
    static Comparator<Person> sortFromHasSiblings = Comparator.comparing(Person::isHasSiblings);
}
