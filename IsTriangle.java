/*
Question 1. Triangle Inequality Theorem
Name: Devin Daid
Date: October 17th, 2021
 */

import java.util.Scanner;

public class IsTriangle {

    public static void main(String[] args) {

        // Ask the user for 6 values
        // The x and y values will be converted into points in the Point class
        // Every 2 points will be used to create a line in the Line class
        // The Line class will then calculate the distance of each line using the points

        // Line 1:
        Scanner scan = new Scanner(System.in);

        // Read the points of the first line
        System.out.print("Line 1: Insert the x value of the first point: ");
        double firstx1 = scan.nextDouble();
        System.out.print("Line 1: Insert the y value of the first point: ");
        double firsty1 = scan.nextDouble();
        PointReal firstpoint1 = new PointReal(firstx1, firsty1);

        System.out.print("Line 1: Insert the x value of the second point: ");
        double firstx2 = scan.nextDouble();
        System.out.print("Line 1: Insert the y value of the second point: ");
        double firsty2 = scan.nextDouble();
        PointReal firstpoint2 = new PointReal(firstx2, firsty2);

        // Construct the first line
        LineReal line1 = new LineReal(firstpoint1, firstpoint2);

        // Get the length of the first line
        double line1Length = line1.getLength();

        System.out.println();

        /////////////////////

        // Line 2:

        // Read the points of the second line
        System.out.print("Line 2: Insert the x value of the first point: ");
        double secondx1 = scan.nextDouble();
        System.out.print("Line 2: Insert the y value of the first point: ");
        double secondy1 = scan.nextDouble();
        PointReal secondpoint1 = new PointReal(secondx1, secondy1);

        System.out.print("Line 2: Insert the x value of the second point: ");
        double secondx2 = scan.nextDouble();
        System.out.print("Line 2: Insert the y value of the second point: ");
        double secondy2 = scan.nextDouble();
        PointReal secondpoint2 = new PointReal(secondx2, secondy2);

        // Construct the second line
        LineReal line2 = new LineReal(secondpoint1, secondpoint2);

        // Get the length of the second line
        double line2Length = line2.getLength();

        System.out.println();

        /////////////////////

        // Line 3:

        // Read the points of the third line
        System.out.print("Line 3: Insert the x value of the first point: ");
        double thirdx1 = scan.nextDouble();
        System.out.print("Line 3: Insert the y value of the first point: ");
        double thirdy1 = scan.nextDouble();
        PointReal thirdpoint1 = new PointReal(thirdx1, thirdy1);

        System.out.print("Line 3: Insert the x value of the second point: ");
        double thirdx2 = scan.nextDouble();
        System.out.print("Line 3: Insert the y value of the second point: ");
        double thirdy2 = scan.nextDouble();
        PointReal thirdpoint2 = new PointReal(thirdx2, thirdy2);

        // Construct the third line
        LineReal line3 = new LineReal(thirdpoint1, thirdpoint2);

        // Get the length of the third line
        double line3Length = line3.getLength();

        /////////////////////

        // Print the lengths of each line
        System.out.println();
        System.out.println("Line 1 Length: " + line1Length);
        System.out.println("Line 2 Length: " + line2Length);
        System.out.println("Line 3 Length: " + line3Length);
        System.out.println();

        System.out.println("Processing...");
        System.out.println("...");
        System.out.println("...");
        System.out.println();

        /////////////////////

        // Check if the three lines satisfy the Triangle Inequality Theorem
        double a, b, c;
        a = line1Length + line2Length;
        b = line1Length + line3Length;
        c = line2Length + line3Length;

        // If any of the sides are bigger than the sum of the 2 other sides,
        // then the theorem fails
        if (a <= line3Length || b <= line2Length || c <= line1Length) {
            System.out.println(":(");
            System.out.println("The Three Lines do not satisfy the Triangle Inequality Theorem!");
        } else {
            System.out.println(":)");
            System.out.println("The Three Lines satisfy the Triangle Inequality Theorem!");
        }

    }

}
