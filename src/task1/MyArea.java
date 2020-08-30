package task1;

import java.util.Scanner;

public class MyArea {

    final static double PI = 3.14;

    // В идеале нужно добиваться того, чтобы каждый класс и метод делали
    // только одну вещь, но делали это хорошо. Этого не всегда можно достичь,
    // но это не про данный случай. Поэтому тут лучше сделать метод, который
    // принимает радиус и возвращает площадь, и убрать все, что не связано с
    // непосредственно "обязанностями" этого метода.

    // Прочти задание внимательно, Ляля, там нужен метод, который принимает
    // параметр.
    public static double areaOfCircle() {

        // Этому место в Main
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the radius: ");
         double radius = sc.nextDouble();

        return PI * Math.pow(radius, 2);

    }
}
