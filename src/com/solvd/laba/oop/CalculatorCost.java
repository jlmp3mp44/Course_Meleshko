package com.solvd.laba.oop;

import com.solvd.laba.oop.Exceptions.CostApplicationExpensiveException;
import com.solvd.laba.oop.Exceptions.PriceDeviceZeroOrLessException;
import com.solvd.laba.oop.Exceptions.SalaryZeroOrLessException;
import com.solvd.laba.oop.Interfaces.CalculatorCostInterface;

import java.util.Arrays;

public final class CalculatorCost implements CalculatorCostInterface {
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

    // Sum salary every employee
    public int calculateAllSalary() {
        int totalSalary = 0;
        totalSalary += calculateAndValidateSalary(developers, "Developer");
        totalSalary += calculateAndValidateSalary(managers, "Manager");
        totalSalary += calculateAndValidateSalary(qaEngineers, "QA Engineer");

        return totalSalary;
    }

    private int calculateAndValidateSalary(Employee[] employees, String category) {
        return Arrays.stream(employees)
                .mapToInt(employee -> {
                    try {
                        validateSalary(employee.getFullSalary());
                    } catch (SalaryZeroOrLessException e) {
                        System.out.println("The salary one of " + category + " = null");
                        System.out.println("CHANGE THE SALARY");
                        System.exit(1);
                    }
                    return employee.getFullSalary();
                })
                .sum();
    }

    //hek the salary  meets the requirements
    private void validateSalary(int salary) throws SalaryZeroOrLessException {
        if (salary <= 0) {
            throw new SalaryZeroOrLessException();
        }
    }

    //sum all cost devices
    public int calculateCostDevices() {
        int costLapTops = calculateAndValidateCostDevices(lapTops, "LapTops");
        int costMouses = calculateAndValidateCostDevices(mouses, "Mouses");
        return costLapTops + costMouses;
    }

    public int calculateAndValidateCostDevices(Device[] devices, String category) {
        int costDevice = Arrays.stream(devices)
                .mapToInt(device -> {
                    try {
                        validatePriceDevice(device.getCost());
                    } catch (PriceDeviceZeroOrLessException e) {
                        System.out.println("The price one of the  " + category + " is null");
                        System.out.println("CHANGE THE PRICE OF " + category);
                        System.exit(1);
                    }
                    return device.getCost();
                })
                .sum();
        return costDevice;
    }

    //check the cost of devices meets the requirements
    public void validatePriceDevice(int price) throws PriceDeviceZeroOrLessException {
        if (price <= 0) throw new PriceDeviceZeroOrLessException();
    }

    //calculate the full cost of application
    public int calculateCost() {
        int fullCost = 0;
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
        try {
            fullCost = (int) (costWithDiscount + costWithDiscount * perantageCompany / 100);
            validateCostApplication(fullCost);
        } catch (CostApplicationExpensiveException e) {
            System.out.println("The cost application very expensive, Customer refused the purchase");
            System.exit(1);
        }
        return fullCost;
    }

    //check the application cost meets the requirements
    public void validateCostApplication(int cost) throws CostApplicationExpensiveException {
        if (cost > 15000) throw new CostApplicationExpensiveException();
    }

}
