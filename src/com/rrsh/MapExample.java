package com.rrsh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        /**
         * HashMap
         * 1. put(key, value) // key harus unique
         * 2. get(key)
         * 3. replace(key, value)
         * 4. size()\
         * 5. entrySet() -> untuk looping (mengubah map jadi collection)
         * */

        Map<String, String> countries = new HashMap<>();

        countries.put("ID", "DKI Jakarta");
        countries.put("SG", "Singapore");
        countries.put("MY", "Kuala Lumpur");
        countries.put("US", "New York");
        System.out.println(countries.size());
        System.out.println(countries);

        for (Map.Entry<String, String> country : countries.entrySet()) {
            System.out.println(country.getKey() + ": " + country.getValue());
        }

        Map<String, List<String>> provinces = new HashMap<>();
        provinces.put("Indonesia", List.of("Jakarta", "Jawa Timur", "Jawa Barat"));
        System.out.println(provinces.size());
        System.out.println(provinces);

        for (Map.Entry<String, List<String>> country : provinces.entrySet()){
            System.out.println(country.getKey() + ": " + country.getValue());
        }
    }
}
