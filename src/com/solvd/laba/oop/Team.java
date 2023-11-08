package com.solvd.laba.oop;

public class Team {

    public Developer[] developers;
    public Manager[] managers;
    public QAEngineer[] qaEngineers;

    public Team(Developer[] developers, Manager[] managers, QAEngineer[] qaEngineers) {
        this.developers = developers;
        this.managers = managers;
        this.qaEngineers = qaEngineers;
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

    public QAEngineer[] getQaTesters() {
        return qaEngineers;
    }

    public void setQaTesters(QAEngineer[] qaEngineers) {
        this.qaEngineers = qaEngineers;
    }

    public String allEmployees() {
        String result = "";
        result += "DEVELOPERS \n";
        for (Developer developer : developers) {
            result += developer.getName() + " " + developer.getSurname() + ";  ";
        }
        result += "\nMANAGERS \n";
        for (Manager manager : managers) {
            result += manager.getName() + " " + manager.getSurname() + ";  ";
        }
        result += "\nQA ENGINEER \n";
        for (QAEngineer qaEngineer : qaEngineers) {
            result += qaEngineer.getName() + " " + qaEngineer.getSurname() + ";  ";
        }
        return result;

    }
}
