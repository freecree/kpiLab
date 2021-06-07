package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class StringInputService {
    private static StringInputService instance;
    @Autowired
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
