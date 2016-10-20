package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 20/10/2016.
 */
public class EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<1000;i++){
            System.out.println("Dime un numero:");
            int num = scanner.nextInt();

            if (num>0){
                System.out.println("Numero positivo. ");
            }
            else if (num<0){
                System.out.println("Numero negativo. ");
            }
            else if (num==0){
                System.out.println("Se acabo.");
                break;
            }
        }
    }
}
