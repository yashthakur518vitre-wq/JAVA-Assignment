/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 5, Question: 3
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}
