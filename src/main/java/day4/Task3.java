package day4;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m =3;
        int n = 3;
        int [][]matrice = new int[m][n];

        Random ran = new Random();
        int maxSum=0;
        for (int i =0; i< matrice.length; i++){
            int sum =0;
             for (int j =0; j < matrice[i].length; j++){
                /*System.out.print((*/matrice[i][j]= ran.nextInt(10);/*) +" ");*/
                 sum  = sum  + matrice[i][j];
                //int x = i;


                }
           // System.out.print("hei"+sum+ " "+ i);

            if(sum>maxSum){
                maxSum = sum;
                int x =i;
                int maxX=0;
                if(maxX<x){
                    maxX=x;
                }if (maxX==m){
                    System.out.println(maxX);
                }else{
                    maxX= maxX--;
                    System.out.println(maxX);
                }



               // System.out.println("it is"+x);
            }



            System.out.println();
           // System.out.println(sum + " "+ maxSum);


        }


       // System.out.println(maxSum);





    }
}
