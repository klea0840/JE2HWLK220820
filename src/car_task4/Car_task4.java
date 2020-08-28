package car_task4;

public class Car_task4 {

    int year;
    double speed;
    int weight;
    String color;

    public Car_task4() {
//        this.year = 2;
//        this.speed = 60;
//        this.weight = 1000;
//        this.color = "Red";
        this(2, 60, 1000, "Red");
    }

    public Car_task4(int year) {
        this();
        this.year = year;
    }

    public Car_task4(int year, double speed) {
        this();
        this.year = year;
        this.speed = speed;
    }

    public Car_task4(int year, double speed, int weight) {
        this();
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car_task4(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
