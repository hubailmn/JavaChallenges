package Challenges;

import java.util.Random;

public class LicenseGen {

    private static final Random rand = new Random();
    private static final char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final int passwordLength = 20;
    private static final int numCount = 5;

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("license #" + i + ": " + generateLicense());
        }
    }

    public static String generateLicense() {
        StringBuilder rawPassword = new StringBuilder();

        for (int i = 0; i < passwordLength - numCount; i++) {
            rawPassword.append(get(letters));
        }


        for (int i = 0; i < numCount; i++) {
            rawPassword.append(getInt());
        }

        char[] shufflePassword = rawPassword.toString().toCharArray();
        randomizeString(shufflePassword);
        return formatPassword(new String(shufflePassword));
    }

    private static void randomizeString(char[] password) {
        Random random = new Random();

        for (int i = password.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = password[index];
            password[index] = password[i];
            password[i] = temp;
        }
    }

    private static char get(char[] characters) {
        return characters[rand.nextInt(characters.length)];
    }

    private static int getInt() {
        return rand.nextInt(10);
    }

    private static String formatPassword(String password) {
        StringBuilder formattedPassword = new StringBuilder();
        int count = 0;

        for (char c : password.toCharArray()) {
            formattedPassword.append(c);

            count++;
            if (count == 5 && formattedPassword.length() < password.length() - 1) {
                formattedPassword.append('-');
                count = 0;
            }
        }

        return formattedPassword.toString();
    }
}
