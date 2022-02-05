package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public Airplane(String manufacturer, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2){
        if(a1.getLength()> a2.getLength()){
            System.out.println("Первый самолет длинее");
        }else if (a1.getLength()< a2.getLength()){
            System.out.println("Второй самолет длинее");
        }else {
            System.out.println("Самолеты равной длины");
        }
    }
}







