package com.solvd.laba.oop;

import com.solvd.laba.oop.interfaces.NameableInterface;

public final class Company implements NameableInterface {
    private String name;
    private Team team;
    private double percentageOfAmount;
    private Technicks technicks;

    public Company(String name, Team team, double percentageOfAmount, Technicks technicks) {
        this.name = name;
        this.team = team;
        this.percentageOfAmount = percentageOfAmount;
        this.technicks = technicks;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public double getPercentageOfAmount() {
        return percentageOfAmount;
    }

    public void setPercentageOfAmount(double percentageOfAmount) {
        this.percentageOfAmount = percentageOfAmount;
    }

    public Technicks getTechnicks() {
        return technicks;
    }

    public void setTechnicks(Technicks technicks) {
        this.technicks = technicks;
    }

    //set the number of employees depends on tasks in application
    public static int setNumOfDevelopes(Functional functional) {
        int numOfTasks = functional.getNumberOfTasks();
        int numOfDevelopers = numOfTasks / 5;
        return numOfDevelopers;
    }

    public static int setNumOfManagers(Functional functional) {
        int numOfManagers = functional.getComplexityApp() / 2 + 1;
        return numOfManagers;
    }

    public static int setNumOfQA(Functional functional) {
        int numOfQA = setNumOfDevelopes(functional);
        return numOfQA;
    }

}
