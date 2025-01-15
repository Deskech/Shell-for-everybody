package Context;

import lombok.Getter;
import lombok.Setter;

import java.nio.file.Paths;

@Getter
@Setter
public class ShellContext {

    private String currentWorkingDirectory = Paths.get("")
            .toAbsolutePath()
            .toString();
}
