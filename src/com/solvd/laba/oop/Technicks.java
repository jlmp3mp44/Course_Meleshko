package com.solvd.laba.oop;

public class Technicks implements InfoInterface {
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

    public final String getInfo() {
        String result = "";
        result += "LapTops \n";
        for (LapTop lapTop : lapTops) {
            result += lapTop.getName() + ";  ";
        }
        result += "\nMouses \n";
        for (Mouse mouse : mouses) {
            result += mouse.getName() + ";  ";
        }
        return result;
    }

}
