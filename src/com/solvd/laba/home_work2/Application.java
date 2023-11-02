package com.solvd.laba.home_work2;

public class Application {

    private String nameApplication;
    private String timeToMake;
    private String decription;

    public Application(String nameApplication, String timeToMake, String decription) {
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

    public String getTimeToMake() {
        return timeToMake;
    }

    public void setTimeToMake(String timeToMake) {
        this.timeToMake = timeToMake;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
