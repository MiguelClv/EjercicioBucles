package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 18/10/2016.
 */
public class EX11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = (int) (100*Math.random()+1);
        int intentos=9;
        System.out.println(x);
        for(int i=1;i<=10;i++){
            System.out.println("Dime un numero:");
            int num = scanner.nextInt();

            if (num>x){
                System.out.println("Es mas pequeño!");
                System.out.println("Te quedan: " +intentos);
            }
            else if (num<x){
                System.out.println("Es mas grande!");
                System.out.println("Te quedan: "+intentos);

            }
            else if (num==x){
                System.out.println("Felicidades!Este es el numero.");
                break;
            }
            if (i==10){
                System.out.println("OOOOOOh! Has fallado.");
                System.out.println("El numero era: "+x);

            }
            intentos--;
        }
    }
}
