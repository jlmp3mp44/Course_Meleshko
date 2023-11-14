package com.solvd.laba.oop;

public class Main {
    public static void main(String[] args) {
        //initializing the important variables
        long seed = 12345L;
        final Application application = new Application("AStore", 2,
                "Appliation - online store with custom clothes", 0);
        //instantiation of classes
        Customer customer = new Customer("Mariya", "Vasulivska", true, application);

        String[] system = new String[]{"IOS", "Android"};
        Functional functional = new Functional(system, 13, true, 3);
        int numOfTasks = functional.getNumberOfTasks();
        int tasksForEveryone = Employee.getTasksForEveryOne(functional);

        //instantiation of employees
        Developer[] developers = makeDevelopers(functional, tasksForEveryone);
        Manager[] managers = makeManagers(functional, tasksForEveryone);
        QAEngineer[] qaEngineers = makeQAEngineers(functional, tasksForEveryone);

        //instantiation of devices
        int sizeOfTeam = developers.length + managers.length + qaEngineers.length;
        LapTop[] lapTops = makeLapTops(sizeOfTeam);
        Mouse[] mouses = makeMouses(sizeOfTeam);

        Technicks technicks = new Technicks(lapTops, mouses);

        Team team = new Team(developers, managers, qaEngineers);
        Company company = new Company("Brains", team, 5, technicks);


        //calculate the cost of application
        CalculatorCost calculatorCost = new CalculatorCost(customer, functional, company);
        int cost = calculatorCost.calculateCost();
        application.setCost(cost);

        //printing main information

        System.out.println("The price for this application will be");
        System.out.println(cost + " $");


        //Write info about Employees and Technicks to the file
        team.writeInfoToTheFile();
        technicks.writeInfoToTheFile();
        //Write info about customer to the file
        customer.writeInfoToTheFile();
    }

    //methods to creating instantiation of employees and devices
    public static Developer[] makeDevelopers(Functional functional, int tasks) {
        Developer developers[] = new Developer[Company.setNumOfDevelopes(functional)];
        for (int i = 0; i < developers.length; i++) {
            developers[i] = new Developer(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextLevel());
        }
        return developers;
    }

    public static Manager[] makeManagers(Functional functional, int tasks) {
        Manager managers[] = new Manager[Company.setNumOfManagers(functional)];
        for (int i = 0; i < managers.length; i++) {
            managers[i] = new Manager(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextExperience());
        }
        return managers;
    }

    public static QAEngineer[] makeQAEngineers(Functional functional, int tasks) {
        QAEngineer qaEngineers[] = new QAEngineer[Company.setNumOfQA(functional)];
        for (int i = 0; i < qaEngineers.length; i++) {
            qaEngineers[i] = new QAEngineer(EmployeeGenerator.getNextName(), EmployeeGenerator.getNextSurname(),
                    tasks, EmployeeGenerator.getNextLevel());
        }
        return qaEngineers;
    }

    public static LapTop[] makeLapTops(int sizeOfTeam) {
        LapTop[] lapTops = new LapTop[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            lapTops[i] = new LapTop(DeviceGenerator.getNextLapTopCost(), DeviceGenerator.getNextLapTopName(),
                    DeviceGenerator.getNextLapTopScreenSize(), DeviceGenerator.getNextLapTopMemorySize());
        }
        return lapTops;
    }

    public static Mouse[] makeMouses(int sizeOfTeam) {
        Mouse[] mouses = new Mouse[sizeOfTeam];
        for (int i = 0; i < sizeOfTeam; i++) {
            mouses[i] = new Mouse(DeviceGenerator.getNextMouseCost(), DeviceGenerator.getNextMouseName(),
                    DeviceGenerator.getNextMouseWireless(), DeviceGenerator.getNextMouseSensor());
        }
        return mouses;
    }

}
