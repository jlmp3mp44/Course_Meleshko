package com.solvd.laba.home_work2;

public class CalculatorCost {

    private Application application;
    private Functional functional;
    private Team team;
    private Team.Developer[] developers;
    private Team.Manager[] managers;
    private Technicks technicks;
    private Technicks.LapTop[] lapTops;
    private Technicks.Mouse[] mouses;

    public CalculatorCost(Application application, Functional functional, Team team, Team.Developer[] developers, Team.Manager[] managers, Technicks technicks, Technicks.LapTop[] lapTops, Technicks.Mouse[] mouses) {
        this.application = application;
        this.functional = functional;
        this.team = team;
        this.developers = developers;
        this.managers = managers;
        this.technicks = technicks;
        this.lapTops = lapTops;
        this.mouses = mouses;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Functional getFunctional() {
        return functional;
    }

    public void setFunctional(Functional functional) {
        this.functional = functional;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team.Developer[] getDevelopers() {
        return developers;
    }

    public void setDevelopers(Team.Developer[] developers) {
        this.developers = developers;
    }

    public Team.Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Team.Manager[] managers) {
        this.managers = managers;
    }

    public Technicks getTechnicks() {
        return technicks;
    }

    public void setTechnicks(Technicks technicks) {
        this.technicks = technicks;
    }

    public Technicks.LapTop[] getLapTops() {
        return lapTops;
    }

    public void setLapTops(Technicks.LapTop[] lapTops) {
        this.lapTops = lapTops;
    }

    public Technicks.Mouse[] getMouses() {
        return mouses;
    }

    public void setMouses(Technicks.Mouse[] mouses) {
        this.mouses = mouses;
    }
}
