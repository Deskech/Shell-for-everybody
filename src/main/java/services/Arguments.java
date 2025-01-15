package services;

public class Arguments {

    public static String extract(String input) {

        String[] splittedString = input.split(" ", 3);
        return splittedString.length > 1 ? splittedString[1].trim() : null;
    }

    public static String extractSubcommand(String input){

        String[] splittedString = input.split(" ", 3);
        return splittedString.length > 2 ? splittedString[2].trim() : null;
    }
}
