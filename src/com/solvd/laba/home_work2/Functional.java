package com.solvd.laba.home_work2;

public class Functional {
    private String system[];
    private int numberOfTasks;
    private boolean mediaContent;

    public Functional(String[] system, int numberOfTasks, boolean mediaContent) {
        this.system = system;
        this.numberOfTasks = numberOfTasks;
        this.mediaContent = mediaContent;
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
}
