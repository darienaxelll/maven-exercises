package main;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s %n", userInput);

        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));


    }
}
