package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 18/10/2016.
 */
public class EX10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = (int) (100*Math.random()+1);
        System.out.println(x);
        for(int i=1;i<1000;i++){
            System.out.println("Dime un numero:");
            int num = scanner.nextInt();

            if (num>x){
                System.out.println("Vuelve a internarlo. Es mas pequeño.");
            }
            else if (num<x){
                System.out.println("Vuelve a intentarlo. Es mas grande.");
            }
            else if (num==x){
                System.out.println("Felicidades!Este es el numero.");
                break;
            }
            }
        }
    }

