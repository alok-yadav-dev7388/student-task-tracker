import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Task " + i + " likho: ");
            tasks.add(scanner.nextLine());
        }

        System.out.println("\nTumhari task list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        try {
            Files.write(Path.of("tasks.txt"), tasks);
            System.out.println("\nTasks tasks.txt mein save ho gaye.");
        } catch (IOException e) {
            System.out.println("File save nahi hui: " + e.getMessage());
        }

        scanner.close();
    }
}