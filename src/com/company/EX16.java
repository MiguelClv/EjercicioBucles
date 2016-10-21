package com.company;

import java.util.Scanner;

/**
 * Created by 54167208t on 21/10/2016.
 */
public class EX16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salariomax=0;

        System.out.println("Cuantos sueldos pondras?");
        int sueldos = scanner.nextInt();

        for (int i=0; i<sueldos; i++){
            System.out.println("Introduce salario: ");
            int sueldo = scanner.nextInt();
            if (sueldo>salariomax){
                salariomax=sueldo;
            }

        }
        System.out.println("El mayor salario es: "+salariomax);
    }
}
