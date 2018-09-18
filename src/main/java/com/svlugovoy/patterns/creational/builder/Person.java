package com.svlugovoy.patterns.creational.builder;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String profession;
    private final String city;
    private final String phone;

    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        profession = builder.profession;
        city = builder.city;
        phone = builder.phone;
    }

    public static class Builder {

        //required
        private final String firstName;
        private final String lastName;

        //optional
        private int age = 18;
        private String profession = "n/a";
        private String city = "Kyiv";
        private String phone = "n/a";

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int val){
            age = val;
            return this;
        }

        public Builder profession(String val){
            profession = val;
            return this;
        }

        public Builder city(String val){
            city = val;
            return this;
        }

        public Builder phone(String val){
            phone = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
