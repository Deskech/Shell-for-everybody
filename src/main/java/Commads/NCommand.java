package Commads;

import java.io.*;

public class NCommand implements Command {

    @Override
    public void execute(String input) {

        if (!input.contains(">")) {
            System.out.println("Not the right syntax it should be: ");
            System.out.println("<command name> 'string to save' > /location/to/store");
            return;
        }

        String filteredString = input.replace("tog", "").trim();
        String[] splittedString = filteredString.split(">", 2);

        if (splittedString.length < 2) {
            System.out.println("Not the right syntax it should be: ");
            System.out.println("<command name> 'string to save' > /location/to/store");
        }
        String fileContent = splittedString[0].trim();
        System.out.println(fileContent);
        String path = splittedString[1].trim();
        System.out.println(path);
        File file = new File(path);

        if (file.exists()){
            System.out.println("File already exists, choose other location");
        }

        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(fileContent);
            System.out.println("File was created at" + path);
        } catch (IOException e) {
            System.out.println("Not possible to write a new Document");
        }
    }
}
