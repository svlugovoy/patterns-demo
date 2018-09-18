package com.svlugovoy.patterns.creational.builder;

public class Client {

    public static void main(String[] args) {

        Person p1 = new Person.Builder("Petr", "Petrov").age(25).profession("Doctor").build();
        Person p2 = new Person.Builder("Ivan", "Ivanov").age(30).profession("Programmer").city("NY").phone("123456").build();

        System.out.println(p1);
        System.out.println(p2);
    }
}
