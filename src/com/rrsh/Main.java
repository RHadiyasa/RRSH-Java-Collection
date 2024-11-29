package com.rrsh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Iterable adalah super class dari collection framework
         * Iterable bikin object yang dapat di iterasi
         * */

        // Cara 1
        // Sifat immutable (tidak dapat dimanipulasi)
        Iterable<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));


        // Cara 2
        // mutable (bisa dimanipulasi)
        Iterable<Integer> numbers2 = new ArrayList<>(Arrays.asList(8, 9, 10, 11, 12));


        // Iterator adalah interface yang digunakan untuk melakukan iterasi
        Iterator<Integer> iteratorNumber = numbers.iterator();

        /**
         * next() -> untuk ambil element selanjutnya
         * hasNext() -> cek apakah ada data pada next()
         * remove() -> menghapus elemet pada iterasi tertentu
         * */

        while (iteratorNumber.hasNext()) {
            Integer next = iteratorNumber.next();
            if (next == 4){
                iteratorNumber.remove();
            }
        }

        for (Integer number : numbers){
            System.out.print(number);
        }
    }
}
