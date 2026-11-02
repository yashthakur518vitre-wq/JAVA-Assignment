/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 8, Question: 1
 */

public class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int val = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = val++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
