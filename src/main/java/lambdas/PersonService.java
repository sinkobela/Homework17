package lambdas;

import java.util.*;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class PersonService {
    private final List<Person> personList;

    public PersonService(List<Person> personList) {
        this.personList = new ArrayList<>(personList);
    }

    public List<String> allPersonsNames() {
        return personList.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName())
                .collect(toList());
    }

    public List<Person> allMajorPersons() {
        return personList.stream()
                .filter(person -> person.getAge() > 17)
                .collect(toList());
    }

    public List<Person> allPersonsFromOradea() {
        return personList.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("Oradea"))
                .collect(toList());
    }

    public List<Person> allPersosFromOradeaOrCluj() {
        return personList.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("Oradea")
                        || person.getCity().equalsIgnoreCase("Cluj"))
                .collect(toList());
    }

    public List<String> allFirstNamesCapitalized() {
        return personList.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(toList());
    }

    public List<String> allFirstnamesAndInitials() {
        return personList.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName().charAt(0) + ".")
                .collect(toList());
    }

    public List<Person> allPersonsBetween18and60() {
        return personList.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .collect(toList());
    }

    public List<Person> allPersonsWithFirstnameStartingWithA() {
        return personList.stream()
                .filter(person -> person.getFirstName().toUpperCase().startsWith("A"))
                .collect(toList());
    }

    public Set<String> allFirstnamesUniquely() {
        return personList.stream()
                .map(Person::getFirstName)
                .collect(toSet());
    }

    public List<Person> sortByFirstname() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(toList());
    }

    public List<Person> sortByLastname() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(toList());
    }

    public List<Person> sortByFirstLastAge() {
        return personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getLastName)
                        .thenComparing(Person::getAge))
                .collect(toList());
    }

    public List<Person> getPersonList() {
        return personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonService that = (PersonService) o;
        return Objects.equals(personList, that.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personList);
    }

    @Override
    public String toString() {
        return "PersonService{" +
                "personList=" + personList +
                '}';
    }
}
