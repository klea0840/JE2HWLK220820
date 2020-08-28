package car;

public class Main {

    public static void main(String[] args) {

        Car carDefault = new Car();
        System.out.println("The color:" + carDefault.color);
        System.out.println("The year: " + carDefault.year);

        Car carOneVariable = new Car(5);
        System.out.println("The color:" + carOneVariable.color);
        System.out.println("The year: " + carOneVariable.year);

        Car carTwoVariables = new Car(7, "Green");
        System.out.println("The color:" + carTwoVariables.color);
        System.out.println("The year: " + carTwoVariables.year);
    }
}
