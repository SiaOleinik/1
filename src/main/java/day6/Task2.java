package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2014, 562, 40000);
        airplane1.setLength(600);
        airplane1.setWeight(5000);
        airplane1.fillUp(32);
        airplane1.info();


    }
}
