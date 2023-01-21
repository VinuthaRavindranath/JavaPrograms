package JavaPrograms.FirstSet;

import java.util.Scanner;

/**
 * Program 6 - Printing the multiplication table of the given input number
 */
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =sc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(num+"x"+i+"="+(num*i));
        }
        sc.close();
    }
}
