package car;

public class Main {

    public static void main(String[] args) {

        /* В данном случае обращение к полям экземпляра класса работает,
        но будет некорректно во многих других случаях, т. к. обычно они
        приватные. Стандартный способ - это объявить getter'ы в классе
        Car и получать значения полей через них (см. предыдущий урок).
         */
        Car carDefault = new Car();
        // Здесь будет что-то типа
        // System.out.println("The color:" + carDefault.getColor());
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
