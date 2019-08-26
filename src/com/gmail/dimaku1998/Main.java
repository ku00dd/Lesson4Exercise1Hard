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
        int[][] mass = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int number = 0;
        int count = mass.length - 1;
        for (int i = 0; i < mass.length / 2; i++, count -= 2) {
            for (int j = i, k = 0; k < count; j++, k++) {
                number = mass[i][j];
                mass[i][j] = mass[mass.length - 1 - j][i];
                mass[mass.length - 1 - j][i] = mass[mass.length - 1 - i][mass.length - 1 - j];
                mass[mass.length - 1 - i][mass.length - 1 - j] = mass[j][mass.length - 1 - i];
                mass[j][mass.length - 1 - i] = number;
            }
            System.out.println();

        }
        System.out.println();
        for (int k = 0; k < mass.length; k++) {
            for (int j = 0; j < mass[0].length; j++) {
                System.out.print(mass[k][j] + " ");
            }
            System.out.println();
        }
    }
}
