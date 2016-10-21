package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 21/10/2016.
 */
public class EX15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cifras = 0;

        System.out.println("Dime un numero: ");
        int num = scanner.nextInt();
        while(num!=0){
            if (num>=0 && num<=99999) {
                num = num / 10;
                cifras++;
            }
            else{
                System.out.println("Numero Incorrecto!!!!!!");
                break;
            }
        }
        System.out.println("Hay "+cifras+ " cifras!");
    }
}
