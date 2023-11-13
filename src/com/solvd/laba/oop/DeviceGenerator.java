package com.solvd.laba.oop;

public class DeviceGenerator {

    static int lapTopIndex = 0;
    static int mouseIndex = 0;
    static int screenSizeIndex = 0;
    static int memorySizesIndex = 0;
    static int wirelessMouseIndex = 0;
    static int hasSenSorMouseIndex = 0;

    protected static String[] namesLaptops = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple"};
    protected static String[] namesMouses = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple"};
    protected static double[] screenSizes = new double[]{14, 15.6, 13, 14.5, 13.5, 12.5, 13.8};
    protected static int[] memorySizes = new int[]{8, 16, 32, 32, 16, 16, 8, 8};
    protected static boolean[] wireless = new boolean[]{true, true, false, true, true, false, true, true};
    protected static boolean[] hasSensor = new boolean[]{true, true, true, false, false, false, true, false};

    //methods to iterate the properties of  devices
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

    public static double getNextLapTopScreenSize() {
        double nextLapTopSreenSize = screenSizes[screenSizeIndex];
        screenSizeIndex++;
        return nextLapTopSreenSize;
    }

    public static int getNextLapTopMemorySize() {
        int nextLapTopMemorySize = memorySizes[memorySizesIndex];
        memorySizesIndex++;
        return nextLapTopMemorySize;
    }

    public static boolean getNextMouseWireless() {
        boolean nextMouseWireless = wireless[wirelessMouseIndex];
        wirelessMouseIndex++;
        return nextMouseWireless;
    }

    public static boolean getNextMouseSensor() {
        boolean nextMouseSensor = hasSensor[hasSenSorMouseIndex];
        hasSenSorMouseIndex++;
        return nextMouseSensor;
    }


}

