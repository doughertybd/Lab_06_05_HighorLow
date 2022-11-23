import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random ();
        int number = random.nextInt(11);
        int guess = 0;

        Scanner in  = new Scanner(System.in);

        System.out.println("Take a guess at what the number is (1-10): ");
        guess = in.nextInt();

        if (guess > number)
        {
            System.out.println("The guess is too high! the correct number was " + number);
        }
        else if (guess < number)
        {
            System.out.println("The guess was too low! The correct number was " + number);
        }
        else  if (guess==number)
        {
            System.out.println("You have guessed the number!");
        }
    }
}