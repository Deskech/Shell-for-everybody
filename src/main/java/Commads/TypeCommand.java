package Commads;

import services.CommandChecker;

public class TypeCommand implements Command {


    @Override
    public void execute(String input) {
        CommandChecker commandChecker = new CommandChecker();
        if (commandChecker.isValid(input)) {
            System.out.println(input + " is a shell builtin");
        } else {
            System.out.println(input + ": not found");
        }

    }
}
