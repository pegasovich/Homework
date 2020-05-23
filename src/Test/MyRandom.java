package Test;

import java.util.Random;

public class MyRandom {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Next turn");


        System.out.println("при помощи Math.random()");
        System.out.println();
        System.out.println("[1;6]");
        System.out.println(" формула = Math.random() * (max-min+1) ) + min");
        System.out.println(" int a = (int) (Math.random() *(6-1+1) +1");
        System.out.println(" int a = (int) (Math.random() *(6) +1");

        for (int i = 0; i <100 ; i++) {
            int a = (int) (Math.random() * 6 +1);
            System.out.print(a+",");
        }
        System.out.println();
        System.out.println("при помощи Random ran = new Random();");

        Random ran = new Random();

        System.out.println();
        System.out.println("[0;8]");
        System.out.println(" формула = (ran.nextInt((max - min) + 1) + min");
        System.out.println(" System.out.print(ran.nextInt((8 - 0) + 1) + min");
        System.out.println(" System.out.print(ran.nextInt(9)");

        for (int i = 0; i <100 ; i++) {
            System.out.print(ran.nextInt(9)+",");
        }

        System.out.println();
        System.out.println();
        System.out.println("[1;6]");
        System.out.println(" формула(ran.nextInt((max - min) + 1) + min");
        System.out.println(" System.out.print(ran.nextInt((6 - 1) + 1) + min");
        System.out.println(" System.out.print(ran.nextInt(6) + 1");

        for (int i = 0; i <100 ; i++) {
            System.out.print(ran.nextInt(6) + 1+",");
        }

       /* Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

        ( Math.random() * (max-min) ) + min*/

    }
}
