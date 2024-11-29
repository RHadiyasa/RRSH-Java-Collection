package com.rrsh.crud;

public class PersonApp {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        personService.createPerson(new Person("Eja", 25));
        personService.createPerson(new Person("Heraldo", 25));
        System.out.println("Cari Eja : "  + personService.findPersonByName("Eja"));
        System.out.println("Get All person : " + personService.findAllPerson());

        Person rahma = new Person("Rahma", 21);
        personService.updatePerson(1, rahma);
        System.out.println("Update Heraldo : " + personService.findAllPerson());


        personService.removePerson(0);
        System.out.println("Remove eja : " + personService.findAllPerson());
    }
}
