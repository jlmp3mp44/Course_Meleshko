package com.solvd.laba.oop;

import com.solvd.laba.oop.Interfaces.FullNameableInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public final class Customer implements FullNameableInterface {
    private final String NAME;
    private final String surname;
    private boolean regularCustomer;
    private Application application;

    public Customer(String name, String surname, boolean regularCustomer, Application application) {
        this.NAME = name;
        this.surname = surname;
        this.regularCustomer = regularCustomer;
        this.application = application;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    public boolean isRegularCustomer() {
        return regularCustomer;
    }

    public void setRegularCustomer(boolean regularCustomer) {
        this.regularCustomer = regularCustomer;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + NAME + '\n' +
                " Surname='" + surname + '\n' +
                " RegularCustomer=" + regularCustomer + '\n' +
                " Application=" + application + '\n' +
                '}';
    }

    public void writeInfoToTheFile() {
        try (FileOutputStream customer = new FileOutputStream("D:\\Course_testimg\\Course\\src\\com\\" +
                "solvd\\laba\\oop\\files\\infoCustomer.txt")) {
            byte[] buffer = toString().getBytes();
            customer.write(buffer);
        } catch (FileNotFoundException e) {
            System.out.println("File with customer didn`t find");
            System.exit(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
