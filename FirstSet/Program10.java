package JavaPrograms.FirstSet;

import java.util.Scanner;

/**
 * Program 10 - Print the area of a circle
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius=sc.nextDouble();

        double areaOfCrircle = Math.PI*radius*radius;
        System.out.println("Area of the circle is :"+ areaOfCrircle);
        sc.close();

    }
}
