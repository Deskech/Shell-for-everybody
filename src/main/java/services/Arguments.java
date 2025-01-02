package services;

public class Arguments {

    public static String extract (String input ){

        String [] splittedString = input.split(" ",2);
        return splittedString [1];
    }
}
