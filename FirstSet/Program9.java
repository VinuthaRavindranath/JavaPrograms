package JavaPrograms.FirstSet;

import java.util.Scanner;

/**
 * Program 9 - Check whether the given character is a Vowel
 */
public class Program9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        boolean isVowel= false;

        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': isVowel=true;
        }

        if (isVowel) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }
        sc.close();

    }
}
