package com.solvd.laba.oop;

public class EmployeeGenerator {

    static int nameIndex = 0;
    static int surnameIndex = 0;
    static int levelIndex = 0;
    static int experienceIndex = 0;

    protected enum Names {
        John, Mary, David, Sarah, Michael, Emily, William, Emma, James, Olivia, Benjamin, Sophia, Daniel, Mia
    }

    protected enum Surnames {
        Smith, Johnson, Brown, Lee, Wilson, Davis, Jones, Miller, Taylor, Anderson, White, Harris, Clark, Walker
    }

    protected static String[] levels = new String[]{"Jun", "Middle", "Jun", "Senior", "Middle",
            "Jun", "Middle", "Jun", "Senior", "Middle", "Jun", "Senior", "Middle"};
    protected static int[] experiences = new int[]{1, 5, 3, 4, 2, 5, 4, 2, 6, 3, 5, 6, 2};

    //methods to iterate the properties of employees
    public static String getNextName() {
        Names[] names = Names.values();
        Names nextName = names[nameIndex];
        nameIndex++;
        return nextName.toString();
    }

    public static String getNextSurname() {
        Surnames[] surnames = Surnames.values();
        Surnames nextSurname = surnames[surnameIndex];
        surnameIndex++;
        return nextSurname.toString();
    }

    public static String getNextLevel() {
        String nextLevel = levels[levelIndex];
        levelIndex++;
        return nextLevel.toString();
    }

    public static int getNextExperience() {
        int nextExperience = experiences[experienceIndex];
        experienceIndex++;
        return nextExperience;
    }
}
