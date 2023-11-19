package com.solvd.laba.oop;

public class DeviceGenerator {

    private static int lapTopIndex = 0;
    private static int mouseIndex = 0;
    private static int screenSizeIndex = 0;
    private static int memorySizesIndex = 0;
    private static int wirelessMouseIndex = 0;
    private static int hasSenSorMouseIndex = 0;
    protected static String[] namesLaptops = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple", "Apple", "Samsung", "Apple"};
    protected static String[] namesMouses = new String[]{"Lenovo", "Apple", "Samsung", "Asus",
            "Lenovo", "Lenovo", "Samsung", "Apple", "Apple", "Samsung", "Apple"};
    protected static double[] screenSizes = new double[]{14, 15.6, 13, 14.5, 13.5, 12.5, 13.8, 14, 14, 15};
    protected static int[] memorySizes = new int[]{8, 16, 32, 32, 16, 16, 8, 8, 16, 32, 16};
    protected static boolean[] wireless = new boolean[]{true, true, false, true, true, false, true, true, true, true, false};
    protected static boolean[] hasSensor = new boolean[]{true, true, true, false, false, false, true, false, false, true, true};

    //methods to iterate the properties of  devices
    public static String getNextDeviceName(String device) {
        switch (device) {
            case "LapTop":
                String nextLapTopName = namesLaptops[lapTopIndex];
                lapTopIndex++;
                return nextLapTopName.toString();
            case "Mouse":
                String nextMouseName = namesMouses[mouseIndex];
                mouseIndex++;
                return nextMouseName;
            default:
                return "No such device";
        }
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

