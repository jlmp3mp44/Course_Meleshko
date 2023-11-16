package com.solvd.laba.oop;

import com.solvd.laba.oop.exceptions.CostApplicationExpensiveException;
import com.solvd.laba.oop.exceptions.PriceDeviceZeroOrLessException;
import com.solvd.laba.oop.exceptions.SalaryZeroOrLessException;
import com.solvd.laba.oop.interfaces.CalculatorCostInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public final class CalculatorCost implements CalculatorCostInterface {
    private static final Logger LOGGER = LogManager.getLogger(CalculatorCost.class);
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
                        if (employee.getFullSalary() <= 0) throw new SalaryZeroOrLessException
                                ("The salary one of " + category + " = null");
                    } catch (SalaryZeroOrLessException e) {
                        LOGGER.error(e.getMessage());
                        System.exit(1);
                    }
                    return employee.getFullSalary();
                })
                .sum();
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
                        if (device.getCost() <= 0) throw new PriceDeviceZeroOrLessException
                                ("The price one of the  " + category + " is null");
                    } catch (PriceDeviceZeroOrLessException e) {
                        LOGGER.error(e.getMessage());
                        System.exit(1);
                    }
                    return device.getCost();
                })
                .sum();
        return costDevice;
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
        double percantageCompany = company.getPercentageOfAmount();

        int fullSalary = calculateAllSalary();
        int fullCostDevices = calculateCostDevices();


        double costWithoutPercantage = (fullSalary + fullCostDevices) / 2 + (complexity * time) +
                (system * complexity) + (numOfTasks * mediaContent);
        double costWithDiscount = costWithoutPercantage - costWithoutPercantage * discount / 100;
        try {
            fullCost = (int) (costWithDiscount + costWithDiscount * percantageCompany / 100);
            if (fullCost > 15000) throw new CostApplicationExpensiveException
                    ("The cost application very expensive, Customer refused the purchase");
        } catch (CostApplicationExpensiveException e) {
            LOGGER.error(e.getMessage());
            System.exit(1);
        }
        return fullCost;
    }


}
