package day6;

public class Task1 {
    public static void main(String[] args) {
        Car carFord = new Car();
        Motorbike motorbikeHarley = new Motorbike("Cruiser", "Black", 3201 );
        carFord.info();
        motorbikeHarley.info();
        carFord.setYear(230);
        motorbikeHarley.yearDifference(100);
        carFord.yearDifference(100);


    }
}
