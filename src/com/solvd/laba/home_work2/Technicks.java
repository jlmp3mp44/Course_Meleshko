package com.solvd.laba.home_work2;

public class Technicks {
    private LapTop[] lapTops;
    private Mouse[] mouses;

    public Technicks(LapTop[] lapTops, Mouse[] mouses) {
        this.lapTops = lapTops;
        this.mouses = mouses;
    }

    public LapTop[] getLapTops() {
        return lapTops;
    }

    public void setLapTops(LapTop[] lapTops) {
        this.lapTops = lapTops;
    }

    public Mouse[] getMouses() {
        return mouses;
    }

    public void setMouses(Mouse[] mouses) {
        this.mouses = mouses;
    }

    static abstract class Device {
        private int cost;
        private String name;

        public Device(int cost, String name) {
            this.cost = cost;
            this.name = name;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class LapTop extends Device {
        LapTop(int cost, String name) {
            super(cost, name);
        }
    }

    static class Mouse extends Device {
        Mouse(int cost, String name) {
            super(cost, name);
        }
    }

}
