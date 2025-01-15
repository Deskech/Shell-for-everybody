package Commads;

import Context.ShellContext;

public class PwdCommand implements Command {
    private final ShellContext shellContext;

    public PwdCommand(ShellContext shellContext) {
        this.shellContext = shellContext;
    }

    @Override
    public void execute(String input) {

        System.out.println(shellContext.getCurrentWorkingDirectory());
    }
}
