package com.solvd.laba.home_work2;

public class Customer {
    private String name;
    private String surname;
    private String age;
    private boolean regularCustomer;

    public Customer(String name, String surname, String age, boolean regularCustomer) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.regularCustomer = regularCustomer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAge() {
        return age;
    }

    public boolean isRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        this.regularCustomer = regularCustomer;
    }
}
