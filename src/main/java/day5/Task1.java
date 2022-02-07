package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mondeo");
        car.setColor("Red");
        car.setYear(2014);

        System.out.println("Это Ford "+car.getModel()+", color "+ car.getColor()+", год выпуска "+ car.getYear());

        }
    }

