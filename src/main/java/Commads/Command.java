package Commads;

import java.io.FileNotFoundException;

public interface Command {

    void  execute (String input) throws FileNotFoundException;
}
