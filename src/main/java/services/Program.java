package services;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

    public static void execute(String input) throws IOException {

        String[] splitString = input.split(" ", 2);
        String command = splitString[0];
        String args = splitString.length > 1 ? splitString[1] : null;

        String path = PathChecker.finExecutable(command);
        if (path != null) {
            ProcessBuilder processBuilder = new ProcessBuilder();

            if (args != null) {
                processBuilder.command(command, args);
            } else {
                processBuilder.command(command);
            }

            processBuilder.inheritIO();
            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();


            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                output.append(line).append(System.lineSeparator());
            }

            try {
                int exitCode = process.waitFor();
                if (exitCode == 0) {
                    System.out.println(output);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        } else {

            System.out.println(command + ": command not found");

        }
    }
}
