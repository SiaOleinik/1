package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String numbersTo20000 = "";
        for (int i = 0; i < 20001; i++) {
            numbersTo20000 = numbersTo20000 + i + " ";
        }
        System.out.print(numbersTo20000);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));
        System.out.println();
        System.out.println();
        System.out.println();
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20001; i++) {
            sb.append(i + " ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы в мс.:" + (stopTime2 - startTime2));
    }

}
