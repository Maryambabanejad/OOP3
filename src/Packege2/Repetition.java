package Packege2;

import java.util.Random;
import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number :");
        int[] a = new int[10];
        for (int i = 1; i <= 15; i++) {
            int x = reader.nextInt();
            a[x]++;
        }
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ": " + a[i]);
        }
//        Random rand = new Random();
//        int[] a = new int[10];
//        for (int i = 1; i <= 100; i++) {
//            int x = 0;
//            a[x] = rand.nextInt(16);
//            a[x]++;
//        }
//        for (int i = 1; i < 10; i++) {
//            System.out.println(i + ":" + a[i]);
//        }
    }
}
