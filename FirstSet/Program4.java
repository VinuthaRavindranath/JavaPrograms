package JavaPrograms.FirstSet;

import java.util.Scanner;

/**
 * Program 4 - In-taking two numbers using Scanner and printing their sum
 */
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, sum;

        System.out.println("Enter the First number");
        a = sc.nextInt();

        System.out.println("Enter the Second number");
        b = sc.nextInt();

        sum = a + b;
        System.out.println("Sum of two numbers is: " + sum);

        sc.close();
    }
}
