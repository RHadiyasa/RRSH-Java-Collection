package com.rrsh;

import com.rrsh.crud.Person;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /**
         * Set : menyimpan data gapake index. syaratnya harus unique
         * Kita gatau urutannya
         * */


        Set<String> animals = Set.of("Icha","Nia","Miranda","Tanti"); // immutable

        System.out.println(animals);

//        animals.add("Burung");

        Set<Integer> numbers = new HashSet<>(Set.of(1, 2, 3, 4, 5)); // mutable
        Set<Integer> numbers2 = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9); // immutable


        System.out.println(numbers);
        System.out.println(numbers2);

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Nia",25));
        persons.add(new Person("Icha",23));
        persons.add(new Person("Miranda",26));
        persons.add(new Person("Tanti",27));

        for (Person person : persons) {
            System.out.println(person.hashCode());
        }
    }
}
