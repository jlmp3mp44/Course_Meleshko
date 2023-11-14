package com.solvd.laba.oop;

import com.solvd.laba.oop.Interfaces.CostableInterface;
import com.solvd.laba.oop.Interfaces.NameableInterface;

public class Application implements NameableInterface, CostableInterface {

    private final String NAME;
    private final int TIME_TO_MAKE;
    private final String DESCRIPTION;/////in months
    private int cost;

    public Application(String NAME, int TIME_TO_MAKE, String DESCRIPTION, int cost) {
        this.NAME = NAME;
        this.TIME_TO_MAKE = TIME_TO_MAKE;
        this.DESCRIPTION = DESCRIPTION;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return NAME;
    }


    public int getTimeToMake() {
        return TIME_TO_MAKE;
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
