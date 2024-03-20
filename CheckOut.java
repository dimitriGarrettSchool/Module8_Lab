import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double price = 0;
        while (true)
        {
            price += SafeInput.getRangedDouble(scanner, "What is the price: ", 0.5, 9.99);

            if (!SafeInput.getYN(scanner, "Continue?")) break;
        }

        System.out.println("Total price: " + price);
    }
}
