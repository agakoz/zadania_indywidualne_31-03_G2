package A2.Lambda.DC;

import A2.Lambda.DC.fileCopying.CopyTimeTesting;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static A2.Lambda.DC.Person.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var people = generatePeople();
        useStreamsAPI(people);

        System.out.println("\n=============================\n");

        CopyTimeTesting testing = new CopyTimeTesting();
        testing.testAllMethods();
    }

    private static List<Person> generatePeople() {
        return List.of(
                new Person("Ala", "Kowalska", new Bike("romet", 14)),
                new Person("Bogdan", "Bogdanowicz", new Bike("cross", 16)),
                new Person("Bena", "Nowak", new Bike("romet", 18)),
                new Person("Adam", "Bogdanowicz", new Bike("romet", 12)),
                new Person("Zenek", "Jakiś", new Bike("cube", 10)),
                new Person("Ania", "Bednarek", new Bike("trekk", 16))
        );
    }

    private static void useStreamsAPI(List<Person> people) {
        //stream API 1:
        System.out.println("Imie Zenek lub Marka roweru zaczyna sie na C lub Rama roweru > 12:");
        people
                .stream()
                .filter(czyZenekPredicate.or(markaZaczynaSieNaCPredicate).or(ramaRoweruWiekszaOd12Predicate))
                .sorted(posortujPoNazwieMarkiRoweru)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("--------------------------------");
        System.out.println("Rama > 12 i Dlugosc nazwiska > 5:");
        //stream API 2:
        people
                .stream()
                .filter(ramaRoweruWiekszaOd12Predicate.and(dlugoscNazwiskaWiekszaOd5Predicate))
                .sorted(posortujPoNazwisku)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("--------------------------------");
        System.out.println("(Rama > 12 i Dlugosc nazwiska > 5) lub Imie Zenek:");
        //stream API 3:
        people
                .stream()
                .filter((ramaRoweruWiekszaOd12Predicate.and(dlugoscNazwiskaWiekszaOd5Predicate)).or(czyZenekPredicate))
                .sorted(posortujPoImieniu)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
