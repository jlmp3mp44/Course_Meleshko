package com.solvd.laba.oop;

public class DeviceGenerator {

    static int lapTopIndex = 0;
    static int mouseIndex = 0;

    protected static String[] namesLaptops = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple"};
    protected static String[] namesMouses = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple"};


    public static String getNextLapTopName() {
        String nextLapTopName = namesLaptops[lapTopIndex];
        lapTopIndex++;
        return nextLapTopName.toString();
    }

    public static String getNextMouseName() {
        String nextMouseName = namesMouses[mouseIndex];
        mouseIndex++;
        return nextMouseName;
    }
}

