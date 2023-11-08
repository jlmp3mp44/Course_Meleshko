package com.solvd.laba.oop;

import java.util.Arrays;

public class CalculatorCost {
    private Customer customer;
    private Application application;
    private Functional functional;
    private Team team;
    private Developer[] developers;
    private Manager[] managers;
    private QAEngineer[] qaEngineers;
    private Technicks technicks;
    private LapTop[] lapTops;
    private Mouse[] mouses;
    private Company company;


    public CalculatorCost(Customer customer, Application application, Functional functional, Team team,
                          Developer[] developers, Manager[] managers, QAEngineer[] qaEngineers,
                          Technicks technicks, LapTop[] lapTops, Mouse[] mouses, Company company) {
        this.customer = customer;
        this.application = application;
        this.functional = functional;
        this.team = team;
        this.developers = developers;
        this.managers = managers;
        this.qaEngineers = qaEngineers;
        this.technicks = technicks;
        this.lapTops = lapTops;
        this.mouses = mouses;
        this.company = company;
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

    public Technicks getTechnicks() {
        return technicks;
    }

    public void setTechnicks(Technicks technicks) {
        this.technicks = technicks;
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

    public QAEngineer[] getQaTesters() {
        return qaEngineers;
    }

    public void setQaTesters(QAEngineer[] qaEngineers) {
        this.qaEngineers = qaEngineers;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int calculateAllSalary() {
        int salaryDevelop = Arrays.stream(developers)
                .mapToInt(Developer::getFullSalary)
                .sum();
        int salaryManager = Arrays.stream(managers)
                .mapToInt(Manager::getFullSalary)
                .sum();
        int salaryQATester = Arrays.stream(qaEngineers)
                .mapToInt(QAEngineer::getFullSalary)
                .sum();
        return salaryDevelop + salaryManager + salaryQATester;
    }

    public int calculateCostDevices() {
        int costLapTop = Arrays.stream(lapTops)
                .mapToInt(LapTop::getCost)
                .sum();
        int costMouses = Arrays.stream(mouses)
                .mapToInt(Mouse::getCost)
                .sum();
        return costLapTop + costMouses;
    }

    public int calculateCost() {
        int time = application.getTimeToMake();
        int complexity = functional.getComplexityApp();
        int system = functional.getSystem().length;
        int numOfTasks = functional.getNumberOfTasks();
        int mediaContent = functional.isMediaContent() ? 2 : 0;
        int discount = customer.isRegularCustomer() ? 7 : 0;
        double perantageCompany = company.getPercentageOfAmount();

        int fullSalary = calculateAllSalary();
        int fullCostDevices = calculateCostDevices();


        double costWithoutPercantage = (fullSalary + fullCostDevices) / 2 + (complexity * time) +
                (system * complexity) + (numOfTasks * mediaContent);
        double costWithDiscount = costWithoutPercantage - costWithoutPercantage * discount / 100;
        double fullCost = costWithDiscount + costWithDiscount * perantageCompany / 100;

        return (int) fullCost;
    }
}
