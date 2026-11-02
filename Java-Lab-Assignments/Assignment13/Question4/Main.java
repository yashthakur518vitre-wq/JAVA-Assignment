/*
 * Student Name: Kartikeya Singh
 * Roll Number: BCS2025378
 * Course: B.Tech CSE
 * Subject: Introduction to Programming Using Java Lab (BCS351)
 * Assignment: 13, Question: 4
 */

public class Main {
    public static void main(String[] args) {
        String str = "abc";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
