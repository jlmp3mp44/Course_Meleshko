package com.solvd.laba.oop;

public class Application {

    private String nameApplication;
    private int timeToMake; ////////in month
    private String decription;
    ///////////from 1 to 5

    public Application(String nameApplication, int timeToMake, String decription) {
        this.nameApplication = nameApplication;
        this.timeToMake = timeToMake;
        this.decription = decription;
    }

    public String getNameApplication() {
        return nameApplication;
    }

    public void setNameApplication(String nameApplication) {
        this.nameApplication = nameApplication;
    }

    public int getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(int timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

}
