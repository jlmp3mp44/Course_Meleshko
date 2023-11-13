package com.solvd.laba.oop;

import com.solvd.laba.oop.Interfaces.FullNameableInterface;

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
}
