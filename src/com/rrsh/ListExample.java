package com.rrsh;

import com.rrsh.crud.Person;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        /**
         * 1. set(index, element)
         * 2. get(index)
         * */
        List<String> animals = new ArrayList<>();
        animals.add("Sapi");
        animals.add("Kambing");
        animals.add("Kucing");
        animals.add("Kucing");
        animals.add("Icha");
        animals.add("Icha");
        animals.add("Icha");

        System.out.println(animals);
        // cara 1 lewat index
        System.out.println("get Kucing: " + animals.get(2));
        System.out.println("get icha: " + animals.get(3));

        // cara 2 lewat element
        System.out.println("index icha: " + animals.indexOf("Icha")); // case sensitive
        System.out.println("get icha: " + animals.get(animals.indexOf("Icha")));

        // set data / update element
        animals.set(1, "Burung");
        System.out.println(animals);

        // menyimpan object person
        List<Person> people = new ArrayList<>();
        people.add(new Person("Eja", 25));
        people.add(new Person("Heraldo", 26));
        people.add(new Person("Satrio", 26));

        for (Person person : people){
            if(person.getName().equalsIgnoreCase("heraLdo")){
                System.out.println(person);
            }
        }
    }
}
