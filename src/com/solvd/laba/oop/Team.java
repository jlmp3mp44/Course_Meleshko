package com.solvd.laba.oop;

import com.solvd.laba.oop.Exceptions.SizeOfTeamSmallException;
import com.solvd.laba.oop.Interfaces.InfoInterface;

public class Team implements InfoInterface {

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

    //get the main information about team, names and surnames of employees
    public final String getInfo() {
        try {
            int sizeOfTeam = developers.length + managers.length + qaEngineers.length;
            validateSizeOfTeam(sizeOfTeam);
        } catch (SizeOfTeamSmallException e) {
            System.out.println("Size of team very small, This project is not  convenient for the company");
            System.exit(1);
        }
        String result = "";
        result += "DEVELOPERS \n";
        for (Developer developer : developers) {
            result += developer.toString() + "/n";
        }
        result += "\nMANAGERS \n";
        for (Manager manager : managers) {
            result += manager.toString() + "\n";
        }
        result += "\nQA ENGINEER \n";
        for (QAEngineer qaEngineer : qaEngineers) {
            result += qaEngineer.toString() + "\n";
        }
        return result;
    }

    public void validateSizeOfTeam(int sizeOfTeam) throws SizeOfTeamSmallException {

        if (sizeOfTeam <= 3) throw new SizeOfTeamSmallException();
    }
}
