/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 14, Question: 2
 */

public class Main {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                count++;
            }
        }

        System.out.println("Count of g: " + count);
    }
}
