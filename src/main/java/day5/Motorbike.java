package day5;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model= model;
        this.color= color;
        this.year = year;
    }

    public String getModel(){
        return model;
    }
    public String getColour(){
        return color;
    }
    public int getYear(){
        return year;
    }
    void info(){
        System.out.println("Это мотоцикл");
    }
}




//Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”, “Цвет”, “Год выпуска”. Создать экземпляр класса Мотоцикл,
// используя конструктор (set методы не использовать). Необходимо придерживаться принципов инкапсуляции и использовать
// ключевое слово this. Вывести в консоль значение каждого из полей, используя get методы.