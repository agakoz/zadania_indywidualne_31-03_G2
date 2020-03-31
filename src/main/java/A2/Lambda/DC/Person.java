package A2.Lambda.DC;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Comparator;
import java.util.function.Predicate;

@AllArgsConstructor
@ToString
@Data
public class Person {
    String name, lastName;
    Bike bike;

    static Predicate<Person> czyZenekPredicate = p -> p.name.toLowerCase().equals("zenek");
    static Predicate<Person> ramaRoweruWiekszaOd12Predicate = p -> p.bike.getRama() > 12;
    static Predicate<Person> markaZaczynaSieNaCPredicate = p -> p.bike.getBrand().toLowerCase().startsWith("c");
    static Predicate<Person> dlugoscNazwiskaWiekszaOd5Predicate = p -> p.getLastName().length() > 5;

    static Comparator<Person> posortujPoNazwieMarkiRoweru = Comparator.comparing(p -> p.bike.getBrand());
    static Comparator<Person> posortujPoNazwisku = Comparator.comparing(Person::getLastName);
    static Comparator<Person> posortujPoImieniu = Comparator.comparing(Person::getName);
}
