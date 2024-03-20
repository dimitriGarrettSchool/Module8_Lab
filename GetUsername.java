import java.util.Scanner;

public class GetUsername
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String first = SafeInput.getNonZeroLenString(in, "What is your first name: ");
        String last = SafeInput.getNonZeroLenString(in, "What is your last name: ");

        System.out.println("Your name is: " + first + " " + last);
    }
}
