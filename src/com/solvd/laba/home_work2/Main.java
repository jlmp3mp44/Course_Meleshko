package com.solvd.laba.home_work2;

public class Main {
    public static void main(String[] args) {
        Customer Mariya = new Customer("Mariya", "Vasulivska", "27");
        Application internetStore = new Application("AStore", "2 months", "Appliation - online store with custom clothes");
        String[] system = new String[]{"IOS", "Android"};
        Functional functional = new Functional(system, 10, true);

        Team.Manager manager1 = new Team.Manager("Olga", "Timofieva", "1000");
        Team.Manager manager2 = new Team.Manager("Anton", "Holinov", "1500");
        Team.Manager manager3 = new Team.Manager("Anna", "Vikonova", "1300");

        Team.Developer developer1 = new Team.Developer("Kate", "Lopunkova", "Jun", "1300");
        Team.Developer developer2 = new Team.Developer("Dima", "Akrunov", "Middle", "2500");
        Team.Developer developer3 = new Team.Developer("Polina", "Davinova", "Middle", "2600");

        Team.Developer[] developers = new Team.Developer[]{developer1, developer2, developer3};
        Team.Manager[] managers = new Team.Manager[]{manager1, manager2, manager3};

        Team team = new Team(developers, managers);

        Technicks.LapTop lapTop1 = new Technicks.LapTop(600, "lenovo");
        Technicks.LapTop lapTop2 = new Technicks.LapTop(700, "asus");
        Technicks.LapTop lapTop3 = new Technicks.LapTop(800, "lenovo");
        Technicks.LapTop lapTop4 = new Technicks.LapTop(1000, "macBook");

        Technicks.Mouse mouse1 = new Technicks.Mouse(100, "lenovo");
        Technicks.Mouse mouse2 = new Technicks.Mouse(130, "asus");
        Technicks.Mouse mouse3 = new Technicks.Mouse(120, "lenovo");
        Technicks.Mouse mouse4 = new Technicks.Mouse(150, "maBook");

        Technicks.LapTop[] lapTops = new Technicks.LapTop[]{lapTop1, lapTop2, lapTop3, lapTop4};
        Technicks.Mouse[] mouses = new Technicks.Mouse[]{mouse1, mouse2, mouse3, mouse4};

        Technicks technicks = new Technicks(lapTops, mouses);

        CalculatorCost calculatorCost = new CalculatorCost(internetStore, functional, team, developers, managers, technicks, lapTops, mouses);


    }
}
