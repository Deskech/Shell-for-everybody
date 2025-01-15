package services;

import java.io.*;
import java.util.Scanner;

public class EditFile {

    public static void edit(String filePath, Scanner scanner) throws IOException {

        File file = new File(filePath);

        StringBuilder actualContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {

                actualContent.append(line).append(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File or directory not found");
            return;
        }
        System.out.println("--- Welcome to list editing mode ---");
        System.out.println("***************************");
        System.out.println("To save the changes type :s");


        StringBuilder changes = new StringBuilder(actualContent);


        String userTextInput;

        while (true) {
            userTextInput = scanner.nextLine();

            if (!scanner.hasNextLine()) {
                System.out.println("Interrupted the edit mode");
                return;
            }
            if (":s".equals(userTextInput.trim())) {
                break;
            }
            changes.append(userTextInput).append(System.lineSeparator());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(changes.toString());
            System.out.println("Changes done successfully in the text file");
        }
    }
}
