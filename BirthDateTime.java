import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int year = SafeInput.getRangedInt(scanner, "What year were you born: ", 1950, 2010);
        int month = SafeInput.getRangedInt(scanner, "What month were you born: ", 1, 12);
        int day = 0;

        if (month == 2)
        {
            if (year % 4 == 0 && year / 400 != 0)
            {
                day = SafeInput.getRangedInt(scanner, "What day were you born: ", 1, 29);
            }

            day = SafeInput.getRangedInt(scanner, "What day were you born: ", 1, 28);
        }

        else if ((month - 1) % 2 == 0)
        {
            day = SafeInput.getRangedInt(scanner, "What day were you born: ", 1, 31);
        }

        else
        {
            day = SafeInput.getRangedInt(scanner, "What day were you born: ", 1, 30);
        }

        int hour = SafeInput.getRangedInt(scanner, "What hour were you born: ", 1, 24);
        int minute = SafeInput.getRangedInt(scanner, "What minute were you born: ", 1, 60);
    }
}
