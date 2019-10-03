/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
         System.out.print("\nEnter your first name: ");
         String firstName = in.nextLine();
         System.out.print("Enter your last name: ");
         String lastName = in.nextLine();
         System.out.print("Enter your grade: ");
         String grade = in.nextLine();
         System.out.print("Enter your age: ");
         String age = in.nextLine();
         System.out.print("Enter your hometown: ");
         String hometown = in.nextLine();

         System.out.println("\nName\t : " + firstName + " " + lastName);
         System.out.println("Grade\t : " + grade);
         System.out.println("Age\t : " + age);
         System.out.println("Hometown : " + hometown + "\n");



        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
         System.out.print("Enter a dollar amount: ");
         double leftover = in.nextDouble();
         leftover *= 100;
         final double DOLLAR_VALUE = 100;
         final double QUARTER_VALUE = 25;
         final double DIME_VALUE = 10;
         final double NICKEL_VALUE = 5;
         final double PENNY_VALUE = 1;
         int numberOfDollars = (int) (leftover / DOLLAR_VALUE);
         leftover %= DOLLAR_VALUE;
         int numberOfQuarters = (int) (leftover / QUARTER_VALUE);
         leftover %= QUARTER_VALUE;
         int numberOfDimes = (int) (leftover / DIME_VALUE);
         leftover %= DIME_VALUE;
         int numberOfNickels = (int) (leftover / NICKEL_VALUE);
         leftover %= NICKEL_VALUE;
         int numberOfPennies = (int) (leftover / PENNY_VALUE);
         System.out.println("\nDOLLARS\t: " + numberOfDollars);
         System.out.println("QUARTERS :" + numberOfQuarters);
         System.out.println("DIMES\t: " + numberOfDimes);
         System.out.println("NICKELS\t: " + numberOfNickels);
         System.out.println("PENNIES\t: " + numberOfPennies);



        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
         System.out.print("\nEnter a dollar amount: ");
         double leftover2 = in.nextDouble();
         leftover2 *= 100;
         final double TEN_DOLLAR_VALUE = 1000;
         final double FIVE_DOLLAR_VALUE = 500;
         int numberOfTenDollars = (int) (leftover2 / TEN_DOLLAR_VALUE);
         leftover2 %= TEN_DOLLAR_VALUE;
         int numberOfFiveDollars = (int) (leftover2 / FIVE_DOLLAR_VALUE);
         leftover2 %= FIVE_DOLLAR_VALUE;
         numberOfDollars = (int) (leftover2 / DOLLAR_VALUE);
         leftover2 %= DOLLAR_VALUE;
         numberOfQuarters = (int) (leftover2 / QUARTER_VALUE);
         leftover2 %= QUARTER_VALUE;
         numberOfDimes = (int) (leftover2 / DIME_VALUE);
         leftover2 %= DIME_VALUE;
         numberOfNickels = (int) (leftover2 / NICKEL_VALUE);
         leftover2 %= NICKEL_VALUE;
         numberOfPennies = (int) (leftover2 / PENNY_VALUE);
         int bills = numberOfTenDollars + numberOfFiveDollars + numberOfDollars;
         int coins = numberOfQuarters + numberOfDimes + numberOfNickels + numberOfPennies;
         System.out.println("\nBILLS\t: " + bills);
         System.out.println("COINS\t: " + coins);




        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
         final double MILE_VALUE = 63360;
         final double YARD_VALUE = 36;
         final double FOOT_VALUE = 12;
         System.out.print("\nEnter a number of inches: ");
         double leftoverInches = in.nextDouble();
         int numberOfMiles = (int) (leftoverInches / MILE_VALUE);
         leftoverInches %= MILE_VALUE;
         int numberOfYards = (int) (leftoverInches / YARD_VALUE);
         leftoverInches %= YARD_VALUE;
         int numberOfFeet = (int) (leftoverInches / FOOT_VALUE);
         leftoverInches %= FOOT_VALUE;
         int numberOfInches = (int) leftoverInches;
         System.out.println("\nMiles\t: " + numberOfMiles);
         System.out.println("Yards\t: " + numberOfYards);
         System.out.println("Feet\t: " + numberOfFeet);
         System.out.println("Inches\t: " + numberOfInches);





        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
         final double KM_VALUE = 100000;
         final double METER_VALUE = 100;
         System.out.print("\nEnter a number of centimeters: ");
         double leftoverCM = in.nextDouble();
         int numberOfKM = (int) (leftoverCM / KM_VALUE);
         leftoverCM %= KM_VALUE;
         int numberOfMeters = (int) (leftoverCM / METER_VALUE);
         leftoverCM %= METER_VALUE;
         int numberOfCM = (int) leftoverCM;
         System.out.println("\nKilometers  : " + numberOfKM);
         System.out.println("Meters\t    : " + numberOfMeters);
         System.out.println("Centimeters : " + numberOfCM);



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         double radius = diameter / 2;
         double areaCircle = Math.PI * Math.pow(radius, 2);
         double circumference = Math.PI * diameter;
         System.out.printf("\nAREA\t      : %.2f\n", areaCircle);
         System.out.printf("CIRCUMFERENCE : %.2f\n", circumference);





        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
         System.out.print("\nEnter a length: ");
         double lengthRectangle = in.nextDouble();
         System.out.print("Enter a width: ");
         double widthRectangle = in.nextDouble();
         double areaRectangle = lengthRectangle * widthRectangle;
         double perimeterRectangle = (2 * lengthRectangle) + (2 * widthRectangle);
         double diagonal = Math.sqrt(Math.pow(lengthRectangle, 2) + Math.pow(widthRectangle, 2));
         System.out.printf("\nAREA\t  : %.2f\n", areaRectangle);
         System.out.printf("PERIMETER : %.2f\n", perimeterRectangle);
         System.out.printf("DIAGONAL  : %.2f\n", diagonal);


        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
         System.out.print("\nEnter a side length: ");
         double lengthHexagon = in.nextDouble();
         double perimeterHexagon = 6 * lengthHexagon;
         double areaHexagon = ((3 * Math.sqrt(3)) / 2) * Math.pow(lengthHexagon, 2);
         System.out.printf("\nAREA\t  : %.2f\n", areaHexagon);
         System.out.printf("PERIMETER : %.2f\n", perimeterHexagon);


        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */
         System.out.print("\nEnter a string: ");
         String splitString = in.next();
         int stringHalfLength = Math.round(splitString.length() / 2);
         String stringHalf1 = splitString.substring(0, stringHalfLength);
         String stringHalf2 = splitString.substring(stringHalfLength);
         System.out.println("\n" + stringHalf2 + stringHalf1);


        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */
         System.out.print("\nEnter your first name: ");
         String firstName2 = in.next();
         System.out.print("Enter your middle name: ");
         String middleName = in.next();
         System.out.print("Enter your last name: ");
         String lastName2 = in.next();
         System.out.println("\n" + firstName2.substring(0, 1) + middleName.substring(0, 1) + lastName2.substring(0, 1) + "\n");



        in.close();
    }
}
