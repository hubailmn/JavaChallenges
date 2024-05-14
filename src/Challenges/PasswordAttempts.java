package Challenges;

import Main.CC;
import Main.While;

import java.util.Scanner;

public class PasswordAttempts {


    public static void main() {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print(CC.YELLOW_BRIGHT + "\n 🔑 Creat a passcode Number: ");
            int passcode = getInt(scan);
            int guess = 3;

            while (guess != 0) {
                System.out.print(CC.YELLOW_BRIGHT + "\n 🔒 Rewrite you passcode: ");
                int input = getInt(scan);
                if (input != passcode) {
                    guess--;
                    if (guess == 0) {
                        System.out.println(CC.RED_BOLD_BRIGHT + "\n ❌ The Passcode Doesn't Match!");
                    } else {
                        System.out.println(CC.RED_BOLD_BRIGHT + "\n ⚠️ Error, The Passcode Doesn't Match! Try Again");
                    }
                } else {
                    System.out.println(CC.GREEN_BRIGHT + "\n 🔓 You passed the security check");
                    break;
                }
            } // while

            if (guess != 0) {
                System.out.println(CC.GREEN_BOLD_BRIGHT + "\n ✅ You Grant Access To The Account");
                System.out.println(CC.CYAN + "\nHere are Your Files \n\t > Top Secret Folder \n\t > School Project Folder \n\t > All  OF My Passwords.txt");

            } else {
                System.out.println(CC.RED_BOLD_BRIGHT + "\n ⚰️ Your account is locked! ");
            }
            While.again();
        }
    } //password


    private static int getInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.print(CC.RED_BOLD_BRIGHT + "\n ⛔️ Invalid, the Passcode Must Be a Numbers\n" + CC.YELLOW_BRIGHT + "\n 🔒Try Again! : ");
            scan.next();
        }
        return scan.nextInt();
    } // getInt

} // CSVFilePractice.CSVFilePractice
