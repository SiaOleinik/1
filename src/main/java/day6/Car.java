package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String newModel){
        model = newModel;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int newYear){
        year = newYear;
    }
    public int getYear(){
        return year;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference (int inputYear){
        int difference = inputYear - year;
        if(difference<0){
            difference = year - inputYear;
        }
        System.out.println(difference);
        return difference;
    }

}
