package day4;

import java.util.Scanner;
import java.util.Random;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arrays = new int[n];
        Random random = new Random();
        int morethan8=0;
        int equals1=0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for(int array: arrays){
            System.out.print((array= random.nextInt(10))+" ");

            sum= sum+array;

        if(array >8){
            morethan8++;
        }
        if(array==1){
            equals1++;
        }
        if(array%2 == 0){
            even++;
        }
        if(array%2 != 0){
            odd++;
        }

        }
        System.out.println();
        System.out.println("Длина массива: "+n);
        System.out.println("Количество чисел больше 8: "+ morethan8);
        System.out.println("Количество чисел равных 1: "+ equals1);
        System.out.println("Количество четных чисел : " + even );
        System.out.println("Количество не четных чисел :" +odd );
        System.out.println("Сумма всех элементов массива :"+ sum);


    }
}
