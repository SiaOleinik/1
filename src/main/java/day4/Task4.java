package day4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for(int i:array){
            System.out.print((array[i]= random.nextInt(10000))+" ");
           // for(int i=0; ;)
        }

    }
}
