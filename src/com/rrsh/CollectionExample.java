package com.rrsh;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        /**
         *
         * Method bawaan dari Collection
         * 1. size()    : Mengambil banyak element di dalam collection
         * 2. isEmpty() : Cek apakah terdapat element di dalam collection
         * 3. Add()     : untuk nambah
         * 4. remove()  : untuk hapus
         *
         * */

        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Mutable
        Collection<Integer> immutableList = List.of(1, 2, 4, 5); // Immutable
        Collection<Integer> numbers2 = new ArrayList<>(List.of(6, 7, 8, 9, 10)); // Mutable

        // immutableList.add(10); // error
        numbers2.add(10);
        System.out.println("Numbers 2       : " + numbers2);
        System.out.println("Immutable List  : " + immutableList);


        System.out.println(immutableList);
        System.out.println(numbers);

        numbers.addAll(numbers2);
        System.out.println(numbers);

        numbers.remove(6);
        System.out.println("Kosong? " + numbers.isEmpty());
        System.out.println(numbers);

        Collection<String> names = new ArrayList<>(Arrays.asList("Heraldo", "Eja", "Satrio", "Rafi"));
        System.out.println(names);

        names.add("Tepen");
        names.add("Calvin");
        System.out.println(names);

        System.out.println(names.contains("Calvin"));
        names.clear();
        System.out.println("clear: " + names);
    }
}
