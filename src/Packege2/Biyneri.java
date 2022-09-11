package Packege2;

import java.util.Scanner;

public class Biyneri {
    public static void main(String[] args) {
        long k=1,bin=0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = reader.nextInt();
        while (n>0){
            int b=n % 2;
            bin = bin+(k*b);
            n=n/2;
            k=k*10;
        }
        System.out.println(bin);
    }
}
