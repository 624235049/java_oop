package chap4;

import java.util.Scanner;

public class CountLetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence : ");
        String sentence = sc.next().toLowerCase();
        System.out.println("sentence = " + sentence);
        System.out.println("length = " + sentence.length());
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            //System.out.println("Letter = " + c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            } 
        }
        System.out.println("The sentence contains vowels : " + count);
        System.out.println("Not vowels : "+(sentence.length()-count));
    }

}