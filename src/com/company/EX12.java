package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 20/10/2016.
 */
public class EX12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mon50=0;
        int mon20=0;
        int mon10=0;
        int mon5=0;
        int mon2=0;
        int mon1=0;

        System.out.println("Dame una cantidad: ");
        int cantidad = scanner.nextInt();
        do {
            if ((cantidad - 50) >= 0) {
                cantidad = cantidad - 50;
                mon50++;
            } else if ((cantidad - 20) >= 0) {
                cantidad = cantidad - 20;
                mon20++;
            } else if ((cantidad - 10) >= 0) {
                cantidad = cantidad - 10;
                mon10++;
            } else if ((cantidad - 5) >= 0) {
                cantidad = cantidad - 5;
                mon5++;
            } else if ((cantidad - 2) >= 0) {
                cantidad = cantidad - 2;
                mon2++;
            } else if ((cantidad - 1) >= 0) {
                cantidad=cantidad-1;
                mon1++;
            }
        }while (cantidad!=0);

        System.out.println("Moneda 50 cent: " + mon50);
        System.out.println("Moneda 20 cent: " + mon20);
        System.out.println("Moneda 10 cent: " + mon10);
        System.out.println("Moneda 5 cent: " + mon5);
        System.out.println("Moneda 2 cent: " + mon2);
        System.out.println("Moneda 1 cent: " + mon1);

        }
}
