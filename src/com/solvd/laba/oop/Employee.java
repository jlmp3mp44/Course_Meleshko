package com.solvd.laba.oop;

abstract class Employee {
    protected static int tasksForEveryOne;
    private String name;
    private String surname;
    protected static int baseSalary = 1000;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int salary) {
        this.baseSalary = salary;
    }

    public static int getTasksForEveryOne(Functional functional) {
        tasksForEveryOne = functional.getNumberOfTasks() / 5;
        return tasksForEveryOne;
    }

    protected abstract int getFullSalary();
}

