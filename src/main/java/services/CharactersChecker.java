package services;

public class CharactersChecker {

    public static String checkCharacters(String argument) {

        String firstLetter = String.valueOf(argument.charAt(0));

        if (firstLetter.equals("$")) {
            String environment =  System.getenv(argument.replace("$", "").trim());

            return environment == null ? argument : environment;
        }
        return argument;
    }
}
