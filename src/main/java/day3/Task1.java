package day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String city = scanner.nextLine();

            if(city.equals("Stop")) {
                break;
            }

            switch (city){
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;

                case "Милан":
                case "Рим":
                case "Турин":
                    System.out.println("Италия");
                    break;

                case "Манчестер":
                case "Лондон":
                case "Ливерпуль":
                    System.out.println("Англия");
                    break;

                case "Мюнхен":
                case "Берлин":
                case "Кёльн":
                    System.out.println("Германия");
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
