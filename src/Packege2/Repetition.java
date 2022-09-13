package Packege2;

import java.util.Random;
import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Number :");
        int[] a = new int[10];                       // ده عدد تک رقمی از کاربر گرفته و تعداد تکرار هر عدد چاپ شود
        for (int i = 1; i <= 15; i++) {             //این حلقه تا گرفتن 15 عدد تک رقمی از عدد 1 توسط کاربر ادامه داشته باشه
            int x = reader.nextInt();              // یک عدد از کاربر بگیر(کاربر شماره خانه را به ما میدهد )
            a[x]++;                               // محتوای اون خونه را پلاس پلاس کن
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + a[i]);            // آی میشود شمارنده هر خانه و  آ آی  میشود تعداد تکرارها
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
