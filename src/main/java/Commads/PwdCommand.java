package Commads;

import java.nio.file.Paths;

public class PwdCommand implements Command{

    @Override
    public void execute(String input) {
        String workingDirectory = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(workingDirectory);
    }
}
