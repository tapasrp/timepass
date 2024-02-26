package org.some;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {5, 1, 4}
        };


        for(int x = 0 ; x< matrix.length; x++){
            for(int y = 0 ; y< matrix[x].length; y++){
                System.out.println("row =" + x + " col=" + y);
                System.out.println( matrix[x][y]);
                System.out.println("------------");

            }
        }
    }
}