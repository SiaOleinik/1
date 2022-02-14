package day9.Task2;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle (String color, double height, double width){
        super(color);
        this.height = height;
        this.width= width;
    }

    @Override
    public double perimeter() {
        return 2*(height+width);
    }

    @Override
    public double area() {
        return height*width;
    }
}