package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n, i, col;

        System.out.println(" lado :  ");

        n = leer.nextInt();


        for( i = 1; i <= n; i++){
            for (col =1; col<= n; col++){
                System.out.print(" * ");


            } System.out.println("");
        }







    }
}
