package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] arrays = new int[100];
        Random rand = new Random();
        for(int i =0; i<arrays.length; i++){
            System.out.print((arrays[i]= rand.nextInt(1000))+ " ");
        }
        int maxNum = arrays[0];
        for(int array: arrays){
            if (array>maxNum){
                maxNum = array;
            }
        }
        int minNum = arrays[0];
        for(int array:arrays){
            if(array<minNum){
                minNum = array;
            }
        }
        int ends0=0;
        for(int array:arrays){
            if(array%10==0){
                ends0++;
            }
        }
        int sum0=0;
        for(int array:arrays) {
            if (array % 10 == 0) {
                sum0 = sum0 + array;
            }
        }
        System.out.println();
        System.out.println("Максимальное число "+maxNum);
        System.out.println("Минимальное число "+minNum);
        System.out.println("Количество элементов, заканчиващихся на 0: "+ends0);
        System.out.println("Сумма элементов, заканчиващихся на 0: "+sum0);

    }
}
