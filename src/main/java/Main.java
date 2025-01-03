import Commads.PwdCommand;
import Commads.TypeCommand;
import services.Program;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        boolean exit = false;

        do {

            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("exit 0")) {
                exit = true;
            } else if (input.matches("^echo .+")) {
                String filteredData = input.replace("echo", "").trim();
                System.out.println(filteredData);
            } else if (input.matches("^type .+")) {
                TypeCommand typeCommand = new TypeCommand();
                typeCommand.execute(input);
            } else if (input.matches("^pwd")) {
                PwdCommand pwdCommand = new PwdCommand();
                pwdCommand.execute(input);
            } else if (!input.isEmpty()) {
                Program.execute(input);
            } else {
                System.out.println(input + ": command not found");
            }

        } while (!exit);
    }
}
