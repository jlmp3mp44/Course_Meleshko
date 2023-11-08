package com.solvd.laba.oop;

import java.util.Objects;

class LapTop extends Device {
    LapTop(int cost, String name) {
        super(cost, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LapTop lapTop = (LapTop) o;
        return (getCost() == lapTop.getCost()) && (getName() == lapTop.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getName());
    }

    @Override
    public String toString() {
        return "Manager{" +
                " Name=" + getName() +
                " Cost=" + getCost() +
                '}';
    }
}
