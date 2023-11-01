package com.solvd.laba.HW1.task1;

public class User {

    private String name;
    private String surname;
    private String age;
    private String role;  //////Student, Teacher, Child, Adult and etc...


    public User(String name, String surname, String age, String role) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        int ageInt = Integer.parseInt(age);
        return ageInt;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        role = role;
    }

    public void printGreeting(String name, String surname){

        System.out.println("Hello " + name + " " + surname);
    }
    public void printYear(int age){
        int yearOfBirth = 2023 - age;
        System.out.println("So, you are " + age +  " years old. That means you are " + yearOfBirth + " year of Birth");
    }

    public void printRole (String role){
        System.out.println("Your Role is " + role );
    }




}