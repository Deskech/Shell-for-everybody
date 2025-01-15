package Commads;

import Context.ShellContext;
import services.Arguments;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CdCommand implements Command {
    private final ShellContext shellContext;


    public CdCommand(ShellContext shellContext) {
        this.shellContext = shellContext;
    }

    @Override
    public void execute(String input) {
        String arg = Arguments.extract(input);

        if (arg != null) {
            Path path = Paths.get(arg);
            if (arg.equals("~")) {
                path = Paths.get(System.getenv("HOME"));
            }

            if (!path.isAbsolute()) {
                Path actualPath = Paths.get(shellContext.getCurrentWorkingDirectory());

                path = actualPath.toAbsolutePath().resolve(arg).normalize();
            }
            if (path.toFile().exists() && path.toFile().isDirectory()) {
                shellContext.setCurrentWorkingDirectory(path.toString());
            } else {
                System.out.println("cd: " + arg + ": " + "No such file or Directory");
            }
        }
    }
}
