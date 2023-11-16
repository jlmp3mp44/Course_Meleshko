package com.solvd.laba.oop;

import com.solvd.laba.oop.interfaces.CostableInterface;
import com.solvd.laba.oop.interfaces.NameableInterface;

public class Application implements NameableInterface, CostableInterface {

    private final String name;
    private final int timeToMake;//in months
    private final String description;
    private int cost;

    public Application(String name, int timeToMake, String description, int cost) {
        this.name = name;
        this.timeToMake = timeToMake;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }


    public int getTimeToMake() {
        return timeToMake;
    }


    public String getDecription() {
        return description;
    }


    @Override
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


}
