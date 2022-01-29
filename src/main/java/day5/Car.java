package day5;

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
    public void presentation(){
        System.out.println("Ford "+model+" Color "+color+" year "+year);
    }
}
