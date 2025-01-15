package Commads;

import services.Arguments;
import services.CommandChecker;
import services.PathChecker;

public class TypeCommand implements Command {


    @Override
    public void execute(String input) {
        String argument = Arguments.extract(input);
        CommandChecker commandChecker = new CommandChecker();


        String executable = PathChecker.finExecutable(argument);


        if (commandChecker.isValid(argument)) {
            System.out.println(argument + " is a shell builtin");
        } else if (executable != null) {
            System.out.println(argument + " is "+ executable);
        } else {
            System.out.println(argument + ": not found");
        }

    }
}
