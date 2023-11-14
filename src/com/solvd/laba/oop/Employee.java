package com.solvd.laba.oop;

import com.solvd.laba.oop.Exceptions.NumOfTasksZeroOrLessException;
import com.solvd.laba.oop.Interfaces.FullNameableInterface;

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

    //distribution of tasks to workers
    public static final int getTasksForEveryOne(Functional functional) {
        try {
            tasksForEveryOne = functional.getNumberOfTasks() / 5;
            validateNumOfTasks();
        } catch (NumOfTasksZeroOrLessException e) {
            System.out.println("Num of tasks for every employee is incorrect: " + tasksForEveryOne);
            System.out.println("CHANGE THE NUMBER OF TASKS");
            System.exit(1);
        }
        return tasksForEveryOne;
    }

    public static void validateNumOfTasks() throws NumOfTasksZeroOrLessException {
        if (tasksForEveryOne <= 0) throw new NumOfTasksZeroOrLessException();
    }

    protected abstract int getFullSalary();
}

