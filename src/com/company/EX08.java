package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 18/10/2016.
 */
public class EX08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime un numero:");
        int num = scanner.nextInt();
        for (int i=1;i<=num;i++){
            if (i%2==0){

            }
            else{
                System.out.println(i);
            }
        }
    }
}
