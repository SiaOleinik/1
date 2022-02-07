package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.info();
        car1.setYear(2012);
        car1.yearDifference(2015);

        Motorbike motorbike = new Motorbike("Cruiser", "Red", 2001);
        motorbike.info();
        System.out.println(motorbike.yearDifference(2006));



    }
}
