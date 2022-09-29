import java.util.Random;
import java.util.Scanner;

/**
 * Java Basic Home Work #5
 *
 * @author Dzmitry Karetsi
 * @todo 19.09.2022
 * @data 20.09.2022
 * 
 */

public class HomeWork5 {
   public static void main(String[] args) {
      Random random = new Random();
      Scanner scanner = new Scanner(System.in);
      String[] words = { " door", " week", " beer", " food", " tree" };
      String word = words[random.nextInt(words.length)];
      char[] mask = { '#', '#', '#', '#' };
      int counter = 0;
      int letterCounter = 0;
      do {
         counter++;
         System.out.print("Guess the word: [" + new String(mask) + "]");
         char letter = scanner.next().charAt(0);
         for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i) && mask[i] == '#') {
               mask[i] = letter;
               letterCounter++;
               System.out.println("Вы угадали  " + i + " букву [" + mask[i] + "], вы молодец!!");
            }
         }
      } while (letterCounter < word.length());
      System.out.println("You guess the word[" + word + "], attempts: " + counter);

   }
}