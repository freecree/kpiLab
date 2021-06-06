package services;

import java.util.Scanner;

public class StringInputService {
    private static StringInputService instance;

    private final Scanner scanner;

    private StringInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public static StringInputService getInstance(Scanner scanner) {
        if(instance == null) {
            instance = new StringInputService(scanner);
        }
        return instance;
    }

    public String ask(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }


}
