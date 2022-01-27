package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа, разделенные пробелом");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a + 1;
        if (a >= b){
            System.out.println("Некорректный ввод");
        } else {

            while ( x < b) {
                if (x % 5 == 0) {
                    if (x % 10 != 0){
                        System.out.print(x+" ");
                    }
                    x++;
                }else{
                x++;
                }
            }
            }

    }
}
