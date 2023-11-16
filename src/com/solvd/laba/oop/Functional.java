package com.solvd.laba.oop;


public class Functional {
    private String system[];
    private int numberOfTasks;
    private boolean mediaContent;
    private int complexityApp;

    public Functional(String[] system, int numberOfTasks, boolean mediaContent, int complexityApp) {
        this.system = system;
        this.numberOfTasks = numberOfTasks;
        this.mediaContent = mediaContent;
        this.complexityApp = complexityApp;
    }

    public String[] getSystem() {
        return system;
    }

    public void setSystem(String[] system) {
        this.system = system;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }

    public boolean isMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(boolean mediaContent) {
        this.mediaContent = mediaContent;
    }

    public int getComplexityApp() {
        return complexityApp;
    }

    public void setComplexityApp(int complexityApp) {
        this.complexityApp = complexityApp;
    }
}
