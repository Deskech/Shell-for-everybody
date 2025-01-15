package Commads;

import services.Arguments;
import services.EditFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CatCommand implements Command {
    private final Scanner scanner;

    public CatCommand(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute(String input) {

        try {
            String args = Arguments.extract(input);
            String subCommand = Arguments.extractSubcommand(input);
            if (args != null && subCommand != null && subCommand.equals("-r")) {
                File file = new File(args);
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                System.out.println(scanner1.nextLine());
            }
            scanner1.close();
            }
            if (args != null && subCommand != null && subCommand.equals("-e")) {
                EditFile.edit(args,scanner);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        }


    }


}
