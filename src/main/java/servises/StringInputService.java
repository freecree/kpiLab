package servises;

import java.util.Scanner;

public class StringInputService {

    private final Scanner scanner;

    public StringInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String ask(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }


}
