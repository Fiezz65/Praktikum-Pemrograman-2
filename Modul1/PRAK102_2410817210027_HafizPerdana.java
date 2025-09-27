package Modul1;

import java.util.Scanner;

public class PRAK102_2410817210027_HafizPerdana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int number = sc.nextInt();
        sc.nextLine();

        int count = 0;
        while (count < 11){
            if (number % 5 == 0){
                System.out.print((number / 5 - 1) + ", ");
            } else{
                System.out.print(number + ", ");
            }
            number++;
            count++;
        }
        System.out.print("\b\b");

        sc.close();
    }
}