package com.solvd.laba.home_work2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Mariya", "Vasulivska", "27", true);
        Application application = new Application("AStore", 2,
                "Appliation - online store with custom clothes", 3);
        String[] system = new String[]{"IOS", "Android"};
        Functional functional = new Functional(system, 10, true);

        int sizeOfTeam = application.getComplexityApp() * 3;
        long seed = 12345L;
        int minSalary = 800;
        int maxSalary = 2500;
        Random random = new Random(seed);
        int randomSalary = random.nextInt(maxSalary - minSalary + 1) + minSalary;

        Developer[] developers = makeDevelopers(sizeOfTeam, randomSalary);
        Manager[] managers = makeManagers(sizeOfTeam, randomSalary);
        QATester[] qaTesters = makeQATeaters(sizeOfTeam, randomSalary);


        Team team = new Team(developers, managers, qaTesters);

        int minCostLapTop = 400;
        int maxCostLapTop = 1200;
        int randomCostLapTop = random.nextInt(maxCostLapTop - minCostLapTop + 1) + minCostLapTop;

        LapTop[] lapTops = makeLapTops(sizeOfTeam, randomCostLapTop);

        int minCostMouse = 50;
        int maxCostMouse = 150;
        int randomCostMouse = random.nextInt(maxCostMouse - minCostMouse + 1) + minCostMouse;


        Mouse[] mouses = makeMouses(sizeOfTeam, randomCostMouse);

        Technicks technicks = new Technicks(lapTops, mouses);

        Company company = new Company("Brains", team, 5);
        System.out.println(application.getTimeToMake());

        CalculatorCost calculatorCost = new CalculatorCost(customer, application, functional, team, developers,
                managers, qaTesters, technicks, lapTops, mouses, company);
        System.out.println("The price for this appliation will be");
        System.out.println(calculatorCost.calculateCost() + " $");

    }

    public static Developer[] makeDevelopers(int sizeOfTeam, int randomSalary) {
        Developer developers[] = new Developer[sizeOfTeam / 3];
        for (int i = 0; i < developers.length; i++) {
            developers[i] = new Developer("Developer" + (i + 1), "Surname", "Position", randomSalary);
        }
        return developers;
    }

    public static Manager[] makeManagers(int sizeOfTeam, int randomSalary) {
        Manager managers[] = new Manager[sizeOfTeam / 3];
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager("Developer" + (i + 1), "Surname", randomSalary);
        }
        return managers;
    }

    public static QATester[] makeQATeaters(int sizeOfTeam, int randomSalary) {
        QATester qaTesters[] = new QATester[sizeOfTeam / 3];
        for (int i = 0; i < qaTesters.length; i++) {
            qaTesters[i] = new QATester("Developer" + (i + 1), "Surname", "Position", randomSalary);
        }
        return qaTesters;
    }

    public static LapTop[] makeLapTops(int sizeOfTeam, int randomCost) {
        LapTop[] lapTops = new LapTop[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            lapTops[i] = new LapTop(randomCost, "laptop" + (i + 1));
        }
        return lapTops;
    }

    public static Mouse[] makeMouses(int sizeOfTeam, int randomCost) {
        Mouse[] mouses = new Mouse[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            mouses[i] = new Mouse(randomCost, "mouse" + (i + 1));
        }
        return mouses;
    }

}
