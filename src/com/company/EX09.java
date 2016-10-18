package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 18/10/2016.
 */
public class EX09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int min=2147483647;
        int total=0;
        int contador=0;
        for (int i=0;i<=1000;i++){
            System.out.println("Dame un numero:");
            int num = scanner.nextInt();

            if (num==999){
                break;
            }
            if(num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }

            total= total+num;
            contador++;
        }
        int vm = total/contador;

        System.out.println("Valor maximo: "+max);
        System.out.println("Valor minimo: "+min);
        System.out.println("Valor medio: "+vm);
    }
}
