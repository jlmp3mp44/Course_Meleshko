package com.solvd.laba.home_work2;

public class Developer extends Employee {
    private String level;

    public Developer(String name, String surname, String level, int salary) {
        super(name, surname, salary);
        this.level = level;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}