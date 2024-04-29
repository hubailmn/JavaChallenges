package Main;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        LocalDateTime expire = LocalDateTime.parse("2024-04-25T02:28:22.748816");

        Duration duration = Duration.between(LocalDateTime.now(), expire);
        
        System.out.println(formattedDuration);


    }

}
