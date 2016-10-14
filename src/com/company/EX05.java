package com.company;

import java.util.Scanner;

/**
 * Created by 54167208T on 14/10/2016.
 */
public class EX05{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a=0,n;
            System.out.println("Ingrese numero");
            n=scanner.nextInt();

            for(int i=1;i<(n+1);i++){
                if(n%i==0){
                    a++;
                }
            }
            if(a!=2){
                System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
            }
        }
}


