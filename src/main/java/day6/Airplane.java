package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, double length, double weight, double fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }
    void info(){
        System.out.println("Производитель: "+manufacturer+ ", год выпуска: "+ year +", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }
    public int fillUp(int n){
        fuel = fuel+n;
        return n;
    }


}
