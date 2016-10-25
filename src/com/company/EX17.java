package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 25/10/2016.
 */
public class EX17 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        String numero;
        System.out.println("Dame un numero: ");
        numero = scanner.next();
        for (int i =0; i < numero.length(); i++) {
            for (int j=0;j <= i;j++) {
                System.out.print(numero.charAt(j));
            }

            System.out.println();

        }
    }
}
