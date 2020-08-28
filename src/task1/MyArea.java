package task1;

import java.util.Scanner;

public class MyArea {

    final static double PI = 3.14;

    public static double areaOfCircle() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        return PI * Math.pow(radius, 2);

    }
}
