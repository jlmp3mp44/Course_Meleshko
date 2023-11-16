package com.solvd.laba.oop;

import com.solvd.laba.oop.exceptions.NumOfTasksZeroOrLessException;
import com.solvd.laba.oop.interfaces.FullNameableInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract class Employee implements FullNameableInterface {
    private static final Logger LOGGER = LogManager.getLogger(Employee.class);
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
            if (tasksForEveryOne <= 0) throw new NumOfTasksZeroOrLessException
                    ("Num of tasks for every employee is incorrect:" + tasksForEveryOne);
        } catch (NumOfTasksZeroOrLessException e) {
            LOGGER.error(e.getMessage());
            System.exit(1);
        }
        return tasksForEveryOne;
    }

    protected abstract int getFullSalary();
}



