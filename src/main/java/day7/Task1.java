package day7;

public class Task1 {

    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 1985, 52, 9541);
        Airplane a2 = new Airplane("SkyJet", 2015,562, 9856);

        Airplane.compareAirplanes(a1, a2);

    }
}