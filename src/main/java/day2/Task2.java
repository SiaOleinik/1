package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа разделенные пробелом");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a + 1;
        if(a>=b){
            System.out.println("Некорректный ввод");
        }else{

            for (int i = x; i < b; i++){
                if( (i % 5 == 0) && (i % 10 != 0) ){
                    System.out.print(i+" ");
                }
            }
        }

    }
}
