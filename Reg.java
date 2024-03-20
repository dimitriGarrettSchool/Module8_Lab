import java.util.Scanner;

public class Reg
{
    public static void main(String[] argss)
    {
        Scanner scanner = new Scanner(System.in);

        SafeInput.getRegEx(scanner, "What is your SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        SafeInput.getRegEx(scanner, "What is your UC student number: ", "(M|m)\\d{5}");
        SafeInput.getRegEx(scanner, "What is your menu choice: ", "[OoSsVvQq]");
    }
}
