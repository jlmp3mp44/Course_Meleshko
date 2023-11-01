package com.solvd.laba.HW1.task1;

public class Main {
    public static void main(String[] args) {
        User user =  new User(args[0], args[1], args[2], args[3]);
        user.printGreeting(user.getName(), user.getSurname());
        user.printRole(user.getRole());
        user.printYear(user.getAge());
    }
}
