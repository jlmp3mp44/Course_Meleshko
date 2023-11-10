package com.solvd.laba.oop;

public final class Customer implements FullNameableInterface {
    private final String NAME;
    private final String surname;
    private boolean regularCustomer;

    public Customer(String name, String surname, boolean regularCustomer) {
        this.NAME = name;
        this.surname = surname;
        this.regularCustomer = regularCustomer;
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
}
