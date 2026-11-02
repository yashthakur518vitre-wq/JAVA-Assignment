/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 6, Question: 3
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 9, 7};
        boolean found = false;
        int repeated = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated = arr[i];
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Repeated value: " + repeated);
        } else {
            System.out.println("No repeated value");
        }
    }
}
