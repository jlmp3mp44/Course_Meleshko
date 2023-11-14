package com.solvd.laba.oop;

import java.util.Objects;

class LapTop extends Device {
    private final double screenSize;
    private final int memorySize;

    LapTop(int cost, String name, double screenSize, int memorySize) {
        super(cost, name);
        this.screenSize = screenSize;
        this.memorySize = memorySize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LapTop lapTop = (LapTop) o;
        return (getCost() == lapTop.getCost()) && (getName() == lapTop.getName() &&
                (getScreenSize() == lapTop.getScreenSize()) && (getMemorySize() == lapTop.getMemorySize()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getName(), getScreenSize());
    }

    @Override
    public String toString() {
        return "LapTop{" +
                " Name=" + getName() +
                " Cost=" + getCost() +
                " ScreenSize=" + getScreenSize() +
                " MemorySize=" + getMemorySize() +
                '}';
    }
}
