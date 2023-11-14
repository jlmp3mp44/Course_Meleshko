package com.solvd.laba.oop;

import com.solvd.laba.oop.Interfaces.InfoInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public void writeInfoToTheFile() {
        try (FileOutputStream allTechnicks = new FileOutputStream("D:\\Course_testimg\\Course\\src\\com\\" +
                "solvd\\laba\\oop\\files\\infoTechnicks.txt")) {
            byte[] buffer = getInfo().getBytes();
            allTechnicks.write(buffer);
        } catch (FileNotFoundException e) {
            System.out.println("File with technicks didn`t find");
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
