package team.legion;

public class Fibonacci {

    public static int calculate(int position) {
        if (position == 0)
            return 0;
        if (position == 1)
            return 1;
        return calculate(position - 1) + calculate(position - 2);
    }
}
