package com.solvd.laba.home_work2;

public class Team {

    public Developer[] developers;
    public Manager[] managers;

    public Team(Developer[] developers, Manager[] managers) {
        this.developers = developers;
        this.managers = managers;
    }

    public Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    static abstract class Employee {
        private String name;
        private String surname;
        private String salary;

        public Employee(String name, String surname, String salary) {
            this.name = name;
            this.surname = surname;
            this.salary = salary;
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

        public String getSalary() {
            return salary;
        }

        public void setSalary(String salary) {
            this.salary = salary;
        }
    }

    public static class Developer extends Employee {
        private String level;

        public Developer(String name, String surname, String level, String salary) {
            super(name, surname, level);
            this.level = level;
        }


        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

    }

    public static class Manager extends Employee {

        public Manager(String name, String surname, String salary) {
            super(name, surname, salary);
        }

    }
}
