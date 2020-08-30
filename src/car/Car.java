package car;

public class Car {

    int year;
    String color;

    public Car() {
        this.year = 2;
        this.color = "Blue";
    }

    public Car(int year) {
        this.year = year;
        color = "Yellow"; // лучше использовать this.color
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
