package com.solvd.laba.oop;

import com.solvd.laba.oop.exceptions.SizeOfTeamSmallException;
import com.solvd.laba.oop.interfaces.InfoInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Team implements InfoInterface {
    private static final Logger LOGGER = LogManager.getLogger(Team.class);
    private Developer[] developers;
    private Manager[] managers;
    private QAEngineer[] qaEngineers;

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

    public QAEngineer[] getQaEngineers() {
        return qaEngineers;
    }

    public void setQaEngineers(QAEngineer[] qaEngineers) {
        this.qaEngineers = qaEngineers;
    }

    //get the main information about team, names and surnames of employees
    public final String getInfo() {
        try {
            int sizeOfTeam = developers.length + managers.length + qaEngineers.length;
            if (sizeOfTeam <= 3) throw new SizeOfTeamSmallException
                    ("Size of team very small, This project is not  convenient for the company");
        } catch (SizeOfTeamSmallException e) {
            LOGGER.error(e.getMessage());
            System.exit(1);
        }
        String result = "";
        result += "DEVELOPERS \n";
        for (Developer developer : developers) {
            result += developer.toString() + "\n";
        }
        result += "\nMANAGERS \n";
        for (Manager manager : managers) {
            result += manager.toString() + "\n";
        }
        result += "\nQA ENGINEERS \n";
        for (QAEngineer qaEngineer : qaEngineers) {
            result += qaEngineer.toString() + "\n";
        }
        return result;
    }


    public void writeInfoToTheFile() {
        try (FileOutputStream allEmployees = new FileOutputStream("D:\\Course_testimg\\Course\\src\\com\\" +
                "solvd\\laba\\oop\\files\\infoEmployees.txt")) {
            byte[] buffer = getInfo().getBytes();
            allEmployees.write(buffer);
        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
