/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 9, Question: 1
 */

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row:");
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(" " + matrix[0][j]);
        }
        System.out.println();

        System.out.print("Last row:");
        for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
            System.out.print(" " + matrix[matrix.length - 1][j]);
        }
        System.out.println();
    }
}
