package car_task4;

import car_task3.Car;

public class Main {

    public static void main(String[] args) {

        Car_task4 carDefault = new Car_task4();
        System.out.println("The color:" + carDefault.getColor());
        System.out.println("The year: " + carDefault.getYear());
        System.out.println("The speed: " + carDefault.getSpeed());
        System.out.println("The weight: " + carDefault.getWeight());
        System.out.println();

        Car_task4 carOneVariable = new Car_task4(5);
        System.out.println("The color:" + carOneVariable.getColor());
        System.out.println("The year: " + carOneVariable.getYear());
        System.out.println("The speed: " + carOneVariable.getSpeed());
        System.out.println("The weight: " + carOneVariable.getWeight());
        System.out.println();


        Car_task4 carTwoVariables = new Car_task4(7, 120);
        System.out.println("The color:" + carTwoVariables.getColor());
        System.out.println("The year: " + carTwoVariables.getYear());
        System.out.println("The speed: " + carTwoVariables.getSpeed());
        System.out.println("The weight: " + carTwoVariables.getWeight());
        System.out.println();

        Car_task4 carThreeVariables = new Car_task4(1, 220, 950);
        System.out.println("The color:" + carThreeVariables.getColor());
        System.out.println("The year: " + carThreeVariables.getYear());
        System.out.println("The speed: " + carThreeVariables.getSpeed());
        System.out.println("The weight: " + carThreeVariables.getWeight());
        System.out.println();

        Car_task4 carFourVariables = new Car_task4(8, 160, 990, "Scarlett");
        System.out.println("The color:" + carFourVariables.getColor());
        System.out.println("The year: " + carFourVariables.getYear());
        System.out.println("The speed: " + carFourVariables.getSpeed());
        System.out.println("The weight: " + carFourVariables.getWeight());

    }
}
