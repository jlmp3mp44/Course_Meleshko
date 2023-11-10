package com.solvd.laba.oop;

public final class Company implements NameableInterface {
    private String name;
    private Team team;
    private double percentageOfAmount;

    public Company(String name, Team team, double percentageOfAmount) {
        this.name = name;
        this.team = team;
        this.percentageOfAmount = percentageOfAmount;
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

    public int setNumOfDevelopes(Functional functional) {
        int numOfTasks = functional.getNumberOfTasks();
        int numOfDevelopers = numOfTasks / 5;
        return numOfDevelopers;
    }

    public int setNumOfManagers(Functional functional) {
        int numOfManagers = functional.getComplexityApp();
        return numOfManagers;
    }

    public int setNumOfQA(Functional functional) {
        int numOfQA = setNumOfDevelopes(functional) / 2;
        return numOfQA;
    }

}
