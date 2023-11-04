package com.solvd.laba.home_work2;

public class Application {

    private String nameApplication;
    private int timeToMake; ////////in month
    private String decription;
    private int complexityApp; ///////////from 1 to 5

    public Application(String nameApplication, int timeToMake, String decription, int complexityApp) {
        this.nameApplication = nameApplication;
        this.timeToMake = timeToMake;
        this.decription = decription;
        this.complexityApp = complexityApp;
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

    public int getComplexityApp() {
        return complexityApp;
    }

    public void setComplexityApp(int complexityApp) {
        this.complexityApp = complexityApp;
    }
}
