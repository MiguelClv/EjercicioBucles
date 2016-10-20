package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 20/10/2016.
 */
public class EX14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int contador=0;
        for(int i=1;i<1000;i++){
            System.out.println("Dime un numero:");
            int num = scanner.nextInt();
            if (num>0){
                total= total+num;
                contador++;
            }
            else if (num<0){
                System.out.println("Numero negativo.Se acabo! ");
                break;
            }
        }
        int valormedio = total/contador;
        System.out.println("Valor medio: "+valormedio);
    }
}
