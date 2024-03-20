import java.util.Scanner;

public class FavNum
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int favoriteInt = SafeInput.getInt(scanner, "What is your favorite int: ");
        System.out.println("Your favorite int is: " + favoriteInt);

        double favoriteDouble = SafeInput.getDouble(scanner, "What is your favorite double: ");
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
