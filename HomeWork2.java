
/**
 * Java Basic Home Work #2
 *
 * @author Dzmitry Karetsi
 * @todo
 * @data 10.09.2022
 *
 */

public class HomeWork2 {
   public static void main(String[] args) {

      checkWeather(30);

      canWalk(true, false);
      plus(8, 8);
      delit(10, 8);
      mnojet(4, 7);
      minus(2, 7);

      dayOfWeek(7);

      canBuyFood(true, false);

   }

   public static void checkWeather(int t) {
      /// Задание номер 1
      // int t = -3;
      if (t < 0) {
         System.out.println("It’s frost");
      } else if (t >= 29) {
         System.out.println("It’s hot");
      } else if (t >= 19) {
         System.out.println("It’s warm");
      } else if (t >= 0) {
         System.out.println("It’s cold");
      }
      return;
   }

   /// Задание номер 2
   public static boolean canWalk(boolean isWeekend, boolean isRain) {

      if (isWeekend & isRain) {
         System.out.println("it's no walk");
      } else if (isWeekend) {
         System.out.println("it's walk");
      } else if (isRain) {
         System.out.println("it's no walk");
      } else if (isRain & isWeekend) {
         System.out.println("it's no walk");
      }
      return true;
   }

   /// Задание номер 3
   public static int plus(int a, int b) {
      int c = a + b;
      System.out.println(c);
      return c;
   }

   public static float delit(float a, float b) {
      float j = a / b;
      System.out.println(j);
      return j;
   }

   public static int mnojet(int a, int b) {
      int u = a * b;
      System.out.println(u);
      return u;
   }

   public static int minus(int a, int b) {
      int k = a - b;
      System.out.println(k);
      return k;
   }

   // Задание номер 4/
   public static void dayOfWeek(int day) {

      switch (day) {
         case 1:
            System.out.println("it's mondey");
            break;
         case 2:
            System.out.println("it's Tuesday");
            break;
         case 3:
            System.out.println("it's Wednesday");
            break;
         case 4:
            System.out.println("it's Thursday");
            break;
         case 5:
            System.out.println("it's Friday");
            break;
         case 6:
            System.out.println("it's Saturday");
            break;
         case 7:
            System.out.println("it's Sunday");
            break;
      }
      return;
   }

   public static boolean canBuyFood(boolean isLidlOpen, boolean isTescoOpen) {

      if (isLidlOpen && isTescoOpen) {
         System.out.println("I can buy food in  LidlOpen and TescoOpen ");
      } else if (isLidlOpen) {
         System.out.println("I can buy food in  LidlOpen");
      } else if (isTescoOpen) {
         System.out.println("I can buy food in TescoOpen");
      } else {
         System.out.println("I cant buy food");
      }
      return isLidlOpen || isTescoOpen;
   }

}
