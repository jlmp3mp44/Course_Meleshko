package com.solvd.laba.oop;

import com.solvd.laba.oop.interfaces.InfoInterface;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Technicks implements InfoInterface {
    private static final Logger LOGGER = LogManager.getLogger(Technicks.class);
    private List<LapTop> lapTops;
    private List<Mouse> mouses;

    public Technicks(List<LapTop> lapTops, List<Mouse> mouses) {
        this.lapTops = lapTops;
        this.mouses = mouses;
    }

    public List<LapTop>getLapTops() {
        return lapTops;
    }

    public void setLapTops(ArrayList<LapTop> lapTops)
    {
        this.lapTops = lapTops;
    }

    public List<Mouse> getMouses() {
        return mouses;
    }

    public void setMouses(ArrayList<Mouse> mouses) {
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
            LOGGER.error(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
