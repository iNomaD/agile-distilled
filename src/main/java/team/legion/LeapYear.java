package team.legion;

public class LeapYear {

    public static boolean isLeap(int year) {
        if (year < 0)
            throw new IllegalArgumentException("Year should be positive");
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }
}
