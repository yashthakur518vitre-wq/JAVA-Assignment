/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 6, Question: 2
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};
        int smallest = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        System.out.println("Smallest: " + smallest + " at index " + index);
    }
}
