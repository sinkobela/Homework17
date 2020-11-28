package lambdas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService persons = new PersonService(List.of(
                new Person("Ana", "Pop", 54, "Oradea"),
                new Person("Donald", "Duck", 17, "Cluj"),
                new Person("Robert", "Fagot", 61, "Narnia"),
                new Person("John", "Travolta", 5, "Budapest"),
                new Person("John", "Travolta", 69, "New York"),
                new Person("John", "English", 11, "London")));

        printAllPersonsNames(persons);
        printAllMajorPersons(persons);
        printAllPersonsFromOradea(persons);
        printAllPersonsFromOradeaOrCluj(persons);
        printAllFirstnamesCapitalized(persons);
        printAllPersonsFirstnameAndMonogram(persons);
        printAllPersonsBetween18And60(persons);
        printAllPersonsFirstnameStarintWithA(persons);
        printAllFirstnamesUniquely(persons);
        printPersonsSortedByFirstname(persons);
        printPersonsSortedByLastname(persons);
        printPersonsSortedByFirstLastAge(persons);
    }

    private static void exerciseSeparator() {
        System.out.println("\n");
    }

    private static void printAllPersonsNames(PersonService persons) {
        exerciseSeparator();
        System.out.println("All the persons name:");
        System.out.println(persons.allPersonsNames());
    }

    private static void printAllMajorPersons(PersonService persons) {
        exerciseSeparator();
        System.out.println("All the major persons:");
        System.out.println(persons.allMajorPersons());
    }

    private static void printAllPersonsFromOradea(PersonService persons) {
        exerciseSeparator();
        System.out.println("All the persons from Oradea:");
        System.out.println(persons.allPersonsFromOradea());
    }

    private static void printAllPersonsFromOradeaOrCluj(PersonService persons) {
        exerciseSeparator();
        System.out.println("All the persons from Oradea or Cluj:");
        System.out.println(persons.allPersosFromOradeaOrCluj());
    }

    private static void printAllFirstnamesCapitalized(PersonService persons) {
        exerciseSeparator();
        System.out.println("All firstnames capitalized:");
        System.out.println(persons.allFirstNamesCapitalized());
    }

    private static void printAllPersonsFirstnameAndMonogram(PersonService persons) {
        exerciseSeparator();
        System.out.println("Firstnames with lastnames initials:");
        System.out.println(persons.allFirstnamesAndInitials());
    }

    private static void printAllPersonsBetween18And60(PersonService persons) {
        exerciseSeparator();
        System.out.println("All persons between 18 and 60:");
        System.out.println(persons.allPersonsBetween18and60());
    }

    private static void printAllPersonsFirstnameStarintWithA(PersonService persons) {
        exerciseSeparator();
        System.out.println("All the persons with firstname starting with A:");
        System.out.println(persons.allPersonsWithFirstnameStartingWithA());
    }

    private static void printAllFirstnamesUniquely(PersonService persons) {
        exerciseSeparator();
        System.out.println("All firstnames uniquely:");
        System.out.println(persons.allFirstnamesUniquely());
    }

    private static void printPersonsSortedByFirstname(PersonService persons) {
        exerciseSeparator();
        System.out.println("Sort the persons by firstname:");
        System.out.println(persons.sortByFirstname());
    }

    private static void printPersonsSortedByLastname(PersonService persons) {
        exerciseSeparator();
        System.out.println("Sort the persons by lastname:");
        System.out.println(persons.sortByLastname());
    }

    private static void printPersonsSortedByFirstLastAge(PersonService persons) {
        exerciseSeparator();
        System.out.println("Sort the persons by first name, last name and then age:");
        System.out.println(persons.sortByFirstLastAge());
    }
}
