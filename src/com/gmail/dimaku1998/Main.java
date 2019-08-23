package com.gmail.dimaku1998;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*int[][] mass = new int[6][6];
        Random rd = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                mass[i][j] = rd.nextInt(10);
            }
        }*/
        int [][] mass = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int number = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = i; j < mass[0].length; j++) {
                number = mass[j][i];
                mass[j][i] = mass[mass.length -1- j][i];
                mass[mass.length-1-j][i] = mass[mass.length-1-i][mass.length-1-j];
                mass[mass.length-1-i][mass.length-1-j] = mass[j][mass.length-1 -i];
                mass[j][mass.length-1 -i]= number;
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

     /*   for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
