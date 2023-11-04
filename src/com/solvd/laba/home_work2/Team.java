package com.solvd.laba.home_work2;

public class Team {

    public Developer[] developers;
    public Manager[] managers;
    public QATester[] qaTesters;

    public Team(Developer[] developers, Manager[] managers, QATester[] qaTesters) {
        this.developers = developers;
        this.managers = managers;
        this.qaTesters = qaTesters;
    }

    public Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Developer[] developers) {
        this.developers = developers;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    public QATester[] getQaTesters() {
        return qaTesters;
    }

    public void setQaTesters(QATester[] qaTesters) {
        this.qaTesters = qaTesters;
    }
}
