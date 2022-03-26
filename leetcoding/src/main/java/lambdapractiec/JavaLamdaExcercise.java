package lambdapractiec;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class JavaLamdaExcercise {

    public static void main(String[] args) {
        List people = Arrays.asList(
                new Person("Kimata", "Dizuza", 25),
                new Person("Makundi", "Ghenua", 35),
                new Person("Gyanpuri", "Mandalekar", 34),
                new Person("Chinmany", "Mandalekar", 30),
                new Person("Mat®huew", "Guy", 30)
        );

        //print all
        printAll(people);

        //java 8
        System.out.println("\n\n\n--------Sort list by first name and age using java 8------");

        Collections.sort(people,  (Person o1, Person o2) ->
                 (o1.lastName.compareTo(o2.lastName) & o1.age.compareTo(o2.age))

        );
        people.stream().sorted(Comparator.comparing(Person::lastname).thenComparing(Person::age)).forEach(System.out::println);;

        printAll(people);

        System.out.println("\n\n\n-");
        //print all people name start with C
        printConditionally(people, new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.firstName.startsWith("C");
            }
        });

        //Print all people with name start with M
        System.out.println("--------Print All person with name start with M using java 8------");

        printConditionally(people, (Person person) -> person.firstName.startsWith("M"));
        //print all
        System.out.println("--------Print All------");
        printConditionally(people, p -> true);
    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
        for(Person p: people) {
            if(predicate.test(p)){
                //System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.println(p);
        }
    }
}

class Person {
    final String firstName;
    final String lastName;
    final Integer age;
    Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String lastname() {
        return lastName;
    }
    public Integer age() {
        return age;
    }
}
