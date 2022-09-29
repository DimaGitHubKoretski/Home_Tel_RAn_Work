import java.util.Random;
import java.util.Scanner;

/**
 * Java Basic Home Work #6*
 *
 * @author Dzmitry Karetsi
 * @todo 21.09.2022
 * @data 23.09.2022
 * 
 *//// СМЫСЛ игры в том что бы помешать сделать 3 шага в ряд в бок в низ в сторону
   /// /// (принцып крестик
   /// нолики но 6х6 ) выигроит тот кто первый соеденит 3 хода
   /// было бы интересно сделать это задание без Random а просто 2 игрока ///
public class HM62 {
   static char[][] table = new char[6][6];
   static Random random = new Random();
   static Scanner scanner = new Scanner(System.in);

   public static void main(String[] args) {
      init();
      printTable();
      do {
         while (true) {
            turnHuman();
            if (isWin('O')) {
               System.out.println("Win");
               break;
            }
            if (isTableFill()) {
               System.out.println("Sorrt, no DRAW");
               break;
            }
            turnAl();
            printTable();
            if (isWin('@')) {
               System.out.println("Win");
               break;
            }
            if (isTableFill()) {
               System.out.println("Sorrt, no DRAW");
               break;
            }
         }
         printTable();
         System.out.println("GAME OVER");
         System.out.println("Are you ready?: Yes? -1, No? - 0:");
      } while (scanner.nextInt() == 1);
   }

   static void init() {
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 6; j++) {
            table[i][j] = '+';
         }
      }
   }

   static void printTable() {
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 6; j++) {
            System.out.print(table[i][j] + " ");
         }
         System.out.println();
      }
   }

   static void turnHuman() {
      int x, y;
      do {
         System.out.print("Enter coordinates x and y [1..6]");
         x = scanner.nextInt() - 1;
         y = scanner.nextInt() - 1;
      } while (!isCellValid(x, y));
      table[y][x] = 'O';
   }

   static void turnAl() {
      int x, y;
      do {
         x = random.nextInt(6);
         y = random.nextInt(6);
      } while (!isCellValid(x, y));
      table[y][x] = '@';
   }

   static boolean isCellValid(int x, int y) {
      if (x < 0 || y < 0 || x > 5 || y > 5) {
         return false;
      }
      return table[y][x] == '+';
   }

   static boolean isWin(char ch) {
      for (int i = 0; i < 6; i++)
         if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch)
               || (table[i][2] == ch && table[i][3] == ch && table[i][4] == ch)
               || (table[i][1] == ch && table[i][2] == ch && table[i][3] == ch)
               || (table[i][3] == ch && table[i][4] == ch && table[i][5] == ch)

               || (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)
               || (table[2][i] == ch && table[3][i] == ch && table[4][i] == ch)
               || (table[1][i] == ch && table[2][i] == ch && table[3][i] == ch)
               || (table[3][i] == ch && table[4][i] == ch && table[5][i] == ch))
            return true;

      if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch)
            || (table[3][3] == ch && table[4][4] == ch && table[5][5] == ch)
            || (table[5][0] == ch && table[4][1] == ch && table[3][2] == ch)
            || (table[2][3] == ch && table[1][4] == ch && table[0][5] == ch)
            || (table[0][1] == ch && table[1][2] == ch && table[2][3] == ch)
            || (table[3][4] == ch && table[4][5] == ch && table[3][2] == ch))
         return true;
      return false;
   }

   static boolean isTableFill() {
      for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 6; j++) {
            if (table[i][j] == '+') {
               return false;
            }
         }
      }
      return true;
   }
}
