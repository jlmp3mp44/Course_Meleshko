package com.solvd.laba.oop;

import java.util.Objects;

public class Manager extends Employee {
    private int numOfDevelopers;
    private final int experience;

    public Manager(String name, String surname, int numOfDevelopers, int experience) {

        super(name, surname);
        this.numOfDevelopers = numOfDevelopers;
        this.experience = experience;
    }

    public int getNumOfDevelopers() {
        return numOfDevelopers;
    }

    public void setNumOfDevelopers(int numOfDevelopers) {
        this.numOfDevelopers = numOfDevelopers;
    }


    @Override
    public int getFullSalary() {
        return getBaseSalary() + numOfDevelopers * 1000 + experience * 200;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return (numOfDevelopers == manager.numOfDevelopers) && (getName() == manager.getName()
                && (getSurname() == manager.getSurname()) && (experience == manager.experience));
    }

    @Override
    public int hashCode() {
        return Objects.hash(numOfDevelopers, getName(), getSurname(), experience);
    }

    @Override
    public String toString() {
        return "Manager{" +
                " Name=" + getName() +
                " Surname=" + getSurname() +
                " Salary=" + getFullSalary() +
                " numOfDevelopers in control=" + numOfDevelopers +
                '}';
    }

}
