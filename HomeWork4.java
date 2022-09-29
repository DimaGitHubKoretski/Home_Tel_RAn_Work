import java.util.Random;
import java.util.Scanner;

/**
 * Java Basic Home Work #4
 *
 * @author Dzmitry Karetsi
 * @todo 14.09.2022
 * @data 18.09.20224
 * 
 */

public class HomeWork4 {
   public static void main(String[] args) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      int number = 0;
      int guess = -1;
      do {
         number = random.nextInt(105);
         for (int i = 0; i < 3; i++) {
            System.out.println("Guess the number [0..9]:");
            guess = scanner.nextInt();
            if (guess < number) {
               System.out.println("Your number is less");
            } else if (guess > number) {
               System.out.println("Your number is bigger");
            } else {
               System.out.println("You WIN, you guess my number");
               break;
            }
         }
         if (number != guess) {
            System.out.println("You lose.");
         }
         System.out.println("Repeat game? Yes - 1, No - 0:");
      } while (scanner.nextInt() == 1);
   }
}