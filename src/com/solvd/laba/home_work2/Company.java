package com.solvd.laba.home_work2;

public class Company {
    private String name;
    private Team team;
    private double percentageOfAmount;

    public Company(String name, Team team, double percentageOfAmount) {
        this.name = name;
        this.team = team;
        this.percentageOfAmount = percentageOfAmount;
    }

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
}
