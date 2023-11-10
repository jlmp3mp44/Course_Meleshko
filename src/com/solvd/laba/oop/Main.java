package com.solvd.laba.oop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        long seed = 12345L;
        Random random = new Random(seed);
        final Application application = new Application("AStore", 2,
                "Appliation - online store with custom clothes", 0);
        int minCostLapTop = 400;
        int maxCostLapTop = 1200;
        int randomCostLapTop = random.nextInt(maxCostLapTop - minCostLapTop + 1) + minCostLapTop;
        int minCostMouse = 50;
        int maxCostMouse = 150;
        int randomCostMouse = random.nextInt(maxCostMouse - minCostMouse + 1) + minCostMouse;

        Team teamNull = new Team(null, null, null);
        Company company = new Company("Brains", teamNull, 5);

        Customer customer = new Customer("Mariya", "Vasulivska", true);

        String[] system = new String[]{"IOS", "Android"};
        Functional functional = new Functional(system, 13, true, 3);
        int tasksForEveryone = Employee.getTasksForEveryOne(functional);

        Developer[] developers = makeDevelopers(company, functional, tasksForEveryone);
        Manager[] managers = makeManagers(company, functional, tasksForEveryone);
        QAEngineer[] qaEngineers = makeQAEngineers(company, functional, tasksForEveryone);

        Team team = new Team(developers, managers, qaEngineers);
        company.setTeam(team);
        int sizeOfTeam = developers.length + managers.length + qaEngineers.length;

        LapTop[] lapTops = makeLapTops(sizeOfTeam, randomCostLapTop);
        Mouse[] mouses = makeMouses(sizeOfTeam, randomCostMouse);

        Technicks technicks = new Technicks(lapTops, mouses);

        CalculatorCost calculatorCost = new CalculatorCost(customer, application, functional, team, developers,
                managers, qaEngineers, technicks, lapTops, mouses, company);
        int cost = calculatorCost.calculateCost();
        application.setCost(cost);
        System.out.println("The price for this appliation will be");
        System.out.println(cost + " $");


        System.out.println("INFO ABOUT EMPLOYEES");
        System.out.println(team.getInfo());

        System.out.println("INFO ABOUT TECHNICKS");
        System.out.println(technicks.getInfo());
    }

    public static Developer[] makeDevelopers(Company company, Functional functional, int tasks) {
        Developer developers[] = new Developer[company.setNumOfDevelopes(functional)];
        for (int i = 0; i < developers.length; i++) {
            developers[i] = new Developer(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextLevel());
        }
        return developers;
    }

    public static Manager[] makeManagers(Company company, Functional functional, int tasks) {
        Manager managers[] = new Manager[company.setNumOfManagers(functional)];
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextExperience());
        }
        return managers;
    }

    public static QAEngineer[] makeQAEngineers(Company company, Functional functional, int tasks) {
        QAEngineer qaEngineers[] = new QAEngineer[company.setNumOfQA(functional)];
        for (int i = 0; i < qaEngineers.length; i++) {
            qaEngineers[i] = new QAEngineer(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextLevel());
        }
        return qaEngineers;
    }

    public static LapTop[] makeLapTops(int sizeOfTeam, int randomCost) {
        LapTop[] lapTops = new LapTop[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            lapTops[i] = new LapTop(randomCost, DeviceGenerator.getNextLapTopName());
        }
        return lapTops;
    }

    public static Mouse[] makeMouses(int sizeOfTeam, int randomCost) {
        Mouse[] mouses = new Mouse[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            mouses[i] = new Mouse(randomCost, DeviceGenerator.getNextMouseName());
        }
        return mouses;
    }

}
