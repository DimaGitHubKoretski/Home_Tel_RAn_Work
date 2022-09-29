/**
 * Java Basic Home Work #1
 *
 * @author Dzmitry Karetsi
 * @version 5.09.2022
 *
 */

class HomeWork1 {
      public static void main(String[] args) {
            // Задание №1

            // Первоя Сторона прямоугольника
            int a = 7;
            System.out.println(a);
            // Вторая Сторона прямоугольника/
            int b = 5;
            System.out.println(b);
            // Третяя Сторона прямоугольника/
            int c = a;
            // Четвертая Сторона прямоугольника/
            int d = b;
            // Периметр /
            float e = (b + a + c + d);
            System.out.println(e);
            // Площядь
            float f = a * b;
            System.out.println(f);
            System.out.printf("e=%f, f=%f ", e, f);

            // Задание №2

            // Целочисленная переменная первая 5
            int y = 5;
            // Целочисленная переменная вторая 3
            int x = 3;
            // Перемножаем Переменные
            float h = y * x;
            System.out.println(h);
            // Делим Переменные
            float p = (float) y / x;
            System.out.println(p);
            // Слажуем Переменные
            float l = y + x;
            System.out.println(l);
            // Отнимаем друг от труга Переменные
            float m = y - x;

            System.out.println(m);
            System.out.printf("h=%f, p=%f, l=%f, m=%f", h, p, l, m);

            // Задание №3

            int[] Array = new int[5];
            for (int i = 0; i < 5; i++) {
                  Array[i] = 10 + (int) (Math.random() * 20);
                  System.out.print(Array[i] + " ");
            }
            System.out.println();

            // Задание №4

            // Диаметор круга 10см2 то-есть 10х10
            int u = 11;
            // незнаю как поставить 3.14 вместо 3.
            double n = Math.PI;
            // Колорий на См2
            int g = 40;
            // Формула поиска площяди круга S = π × d2 : 4
            double z = (n * (u * u)) / 4;
            System.out.println(z);
            // ответ колорий
            double w = z * g;
            System.out.println(w);
            System.out.printf("z=%f, w=%f ", z, w);

      }
}
