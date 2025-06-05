package Challenges;

import Main.While;

import java.util.Scanner;

public class GradeCalc {

    public static void main(String[] args) {

        Scanner gradeScanner = new Scanner(System.in);

        String gradeLetter = "none";

        while (true) {
            System.out.print("\n\n> Enter your grade here.. ");
            double grade = gradeScanner.nextDouble();

            if (grade >= 90 && grade <= 100) {
                gradeLetter = ("A");
            } else if (grade >= 80 && grade < 90) {
                gradeLetter = ("B");
            } else if (grade >= 70 && grade < 80) {
                gradeLetter = ("C");
            } else if (grade >= 60 && grade < 70) {
                gradeLetter = ("D");
            } else if (grade >= 0 && grade < 60) {
                gradeLetter = ("F");
            } else {
                System.out.println("Invalid input. Please enter a grade between 0 and 100.");
            }

            System.out.println("your grade is " + grade + " you get an \"" + gradeLetter + "\"");

            While.again();

        }
    }

}
