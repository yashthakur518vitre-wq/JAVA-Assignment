/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 2, Question: 4
 */

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
