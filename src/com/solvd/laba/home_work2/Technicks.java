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


}
