import Commads.*;
import Context.ShellContext;
import services.Arguments;
import services.Program;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        boolean exit = false;
        ShellContext shellContext = new ShellContext();
        do {
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            String command = input.split(" ")[0];

            switch (command) {
                case "exit":
                    String argument = Arguments.extract(input);
                    if (argument != null && argument.equals("0")) {
                        exit = true;
                    } else {
                        System.out.println(input + ": command not found");
                    }
                    break;

                case "echo":
                    EchoCommand echoCommand = new EchoCommand();
                    echoCommand.execute(input);
                    break;

                case "type":
                    TypeCommand typeCommand = new TypeCommand();
                    typeCommand.execute(input);
                    break;

                case "cd":
                    CdCommand cdCommand = new CdCommand(shellContext);
                    cdCommand.execute(input);
                    break;

                case "pwd":
                    PwdCommand pwdCommand = new PwdCommand(shellContext);
                    pwdCommand.execute(input);
                    break;

                case "cat":
                    CatCommand catCommand = new CatCommand(scanner);
                    catCommand.execute(input);
                    break;

                case "tog":
                    NCommand nCommand = new NCommand();
                    nCommand.execute(input);
                    break;
                default:
                    if (!input.isEmpty()) {
                        Program.execute(input);
                    } else {
                        System.out.println(input + ": command not found");
                    }
                    break;
            }
        } while (!exit);
    }
}


