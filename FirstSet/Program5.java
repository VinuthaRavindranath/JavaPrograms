package JavaPrograms.FirstSet;

import java.util.Scanner;

/**
 * Program 5 - Check whether the given input number is even or odd
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =sc.nextInt();

        if (num%2==0) {
            System.out.println(num+ "is an even number");
        } else {
            System.out.println(num+ "is an odd number");
        }
        sc.close();
    }
}
