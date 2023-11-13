package com.solvd.laba.oop;

import com.solvd.laba.oop.Interfaces.InfoInterface;

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

    //get the main information about technicks, names of devices, and their properties
    public final String getInfo() {
        String result = "";
        result += "LapTops \n";
        for (LapTop lapTop : lapTops) {
            result += lapTop.toString() + "\n";
        }
        result += "\nMouses \n";
        for (Mouse mouse : mouses) {
            result += mouse.toString() + "\n";
        }
        return result;
    }

}
