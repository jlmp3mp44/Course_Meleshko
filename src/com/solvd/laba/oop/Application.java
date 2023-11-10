package com.solvd.laba.oop;

public class Application implements NameableInterface, CostableInterface {

    private final String NAME;
    private final int TIMETOMAKE;
    private final String DESCRIPTION;/////in months
    private int cost;

    public Application(String NAME, int TIMETOMAKE, String DESCRIPTION, int cost) {
        this.NAME = NAME;
        this.TIMETOMAKE = TIMETOMAKE;
        this.DESCRIPTION = DESCRIPTION;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return NAME;
    }


    public int getTimeToMake() {
        return TIMETOMAKE;
    }


    public String getDecription() {
        return DESCRIPTION;
    }


    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
