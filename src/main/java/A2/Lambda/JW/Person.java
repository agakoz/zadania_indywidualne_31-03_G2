package A2.Lambda.JW;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String lastName;
    private int age;

    public List<Person> filterWithNegateAndSortReversed(List<Person> list){
        return list.stream()
                .filter(nameEndsWithAPredicate.negate().or(lastNameNotLongerThan7CharactersPredicate))
                .sorted(sortByAge.reversed())
                .collect(Collectors.toList());
    }

    public List<Person> filterWithTwoConditionsAndSort(List<Person> list){
        return list.stream()
                .filter(nameEndsWithAPredicate.and(ageIsBetween30And35Predicate))
                .sorted(sortByLastName)
                .collect(Collectors.toList());
    }
    public List<Person> filterWithNegateAndSortTwoTimes(List<Person> list){
        return list.stream()
                .filter(ageIsBetween30And35Predicate.negate())
                .sorted(sortByAge.thenComparing(sortByLastName))
                .collect(Collectors.toList());
    }



    static Predicate<Person> nameEndsWithAPredicate = person -> person.name.endsWith("a");
    static Predicate<Person> ageIsBetween30And35Predicate = person -> person.age >= 30 && person.age <= 35;
    static Predicate<Person> lastNameNotLongerThan7CharactersPredicate = person -> person.lastName.length() <= 7;

    static Comparator<Person> sortByName = Comparator.comparing(Person::getName);
    static Comparator<Person> sortByLastName = Comparator.comparing(Person::getLastName);
    static Comparator<Person> sortByAge = Comparator.comparing(Person::getAge);



}
