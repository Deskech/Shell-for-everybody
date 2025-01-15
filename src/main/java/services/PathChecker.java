package services;

import java.io.File;

public class PathChecker {

    public static String finExecutable(String argument) {

        String pathVariable = System.getenv("PATH");

        if (pathVariable == null) {
            return null;
        }
        String[] pathList = pathVariable.split(":");

        for (String dir : pathList) {
            String fullPath = dir + "/" + argument;
            String fullPathExe = dir + "/" + argument + ".exe";
            File f = new File(fullPath);
            File fileExe = new File(fullPathExe);
            if (f.exists() && f.canExecute()) {
                return f.getAbsolutePath();
            } else if (fileExe.exists() && fileExe.canExecute()) {
                return fileExe.getAbsolutePath();
            }
        }
        return null;
    }
}
