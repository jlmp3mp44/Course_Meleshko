package com.solvd.laba.oop;

abstract class Employee implements FullNameableInterface {
    protected static int tasksForEveryOne;
    private final String name;
    private final String surname;
    protected static final int BASE_SALARY = 1000;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public final int getBaseSalary() {
        return BASE_SALARY;
    }

    public static final int getTasksForEveryOne(Functional functional) {
        tasksForEveryOne = functional.getNumberOfTasks() / 5;
        return tasksForEveryOne;
    }

    protected abstract int getFullSalary();
}

