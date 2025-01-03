package Commads;

import java.nio.file.Paths;

public class PwdCommand implements Command{

    @Override
    public void execute(String input) {
        String workingDirectories = Paths.get("")
                .toAbsolutePath()
                .toString();
        System.out.println(workingDirectories);
    }
}
