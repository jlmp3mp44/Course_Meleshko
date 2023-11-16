package com.solvd.laba.oop;

import com.solvd.laba.oop.exceptions.CostApplicationExpensiveException;
import com.solvd.laba.oop.exceptions.PriceDeviceZeroOrLessException;
import com.solvd.laba.oop.exceptions.SalaryZeroOrLessException;
import com.solvd.laba.oop.interfaces.CalculatorCostInterface;

import java.util.Arrays;

public final class CalculatorCost implements CalculatorCostInterface {
    private Customer customer;
    private Functional functional;
    private Company company;


    public CalculatorCost(Customer customer, Functional functional, Company company) {
        this.customer = customer;
        this.functional = functional;
        this.company = company;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Application getApplication() {
        return customer.getApplication();
    }

    public Functional getFunctional() {
        return functional;
    }

    public void setFunctional(Functional functional) {
        this.functional = functional;
    }

    public Team getTeam() {
        return company.getTeam();
    }

    public Developer[] getDevelopers() {
        return getTeam().getDevelopers();
    }

    public Manager[] getManagers() {
        return getTeam().getManagers();
    }

    public Technicks getTechnicks() {
        return company.getTechnicks();
    }

    public LapTop[] getLapTops() {
        return getTechnicks().getLapTops();
    }

    public Mouse[] getMouses() {
        return getTechnicks().getMouses();
    }

    public QAEngineer[] getQaEngineers() {
        return getTeam().getQaEngineers();
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
        totalSalary += calculateAndValidateSalary(getDevelopers(), "Developer");
        totalSalary += calculateAndValidateSalary(getManagers(), "Manager");
        totalSalary += calculateAndValidateSalary(getQaEngineers(), "QA Engineer");

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

    //сheck the salary  meets the requirements
    private void validateSalary(int salary) throws SalaryZeroOrLessException {
        if (salary <= 0) {
            throw new SalaryZeroOrLessException();
        }
    }

    //sum all cost devices
    public int calculateCostDevices() {
        int costLapTops = calculateAndValidateCostDevices(getLapTops(), "LapTops");
        int costMouses = calculateAndValidateCostDevices(getMouses(), "Mouses");
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
        int time = customer.getApplication().getTimeToMake();
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
