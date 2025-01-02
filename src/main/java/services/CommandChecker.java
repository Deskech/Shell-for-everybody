package services;

import Commads.ExistingCommands;

public class CommandChecker {


    public  boolean isValid(String command){

        for (ExistingCommands existingCommands : ExistingCommands.values() ){
            if (existingCommands.name().equals(command)){
                return true;
            }
        }
        return false;
    }
}
