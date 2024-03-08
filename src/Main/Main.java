package Main;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

       System.out.print("Input: ");

       String inputCode = "";
       String outputCode = convertStringsToByteArrays(inputCode);

        System.out.println("\n\n");

       System.out.println(outputCode);

    }


    private static String convertToByteArray(String str){
        byte[] byteArray = str.getBytes();

        StringBuilder sb = new StringBuilder();

        sb.append("new String(new byte[]{");

        for (int i = 0; i < byteArray.length; i++) {
            sb.append(byteArray[i]);
            if (i < byteArray.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("})");

        return sb.toString();
    }

    private static String toString(String str) {
        String byteValues = str.replaceAll(".*\\{(.*)\\}.*", "$1");

        String[] byteStrings = byteValues.split(",\\s*");

        byte[] byteArray = new byte[byteStrings.length];
        for (int i = 0; i < byteStrings.length; i++) {
            byteArray[i] = Byte.parseByte(byteStrings[i].trim());
        }

        return new String(byteArray, StandardCharsets.UTF_8);
    }

    private static String convertStringsToByteArrays(String input) {
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile("\"(.*?)\"");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String matchedString = matcher.group(1);
            String byteArrayString = convertToByteArray(matchedString);
            matcher.appendReplacement(result, Matcher.quoteReplacement(byteArrayString));
        }

        matcher.appendTail(result);

        return result.toString();
    }



}
