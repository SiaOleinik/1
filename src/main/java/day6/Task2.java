package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane boeing747 = new Airplane("Boeing", 2014, 456, 7520, 62);
        boeing747.setYear(2021);
        boeing747.setLength(652);
        boeing747.fillUp(563);
        boeing747.fillUp(25);
        boeing747.info();
    }
}
