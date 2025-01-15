package Commads;

import services.CharactersChecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EchoCommand implements Command {

    @Override
    public void execute(String input) {
        String filteredData = input.replace("echo", "").trim();
        Pattern pattern = Pattern.compile("'([^']*)'");

        Matcher matcher = pattern.matcher(filteredData);
        if (matcher.find()) {

            System.out.println(CharactersChecker.checkCharacters(matcher.group(1)));
        }else {
            System.out.println(filteredData);
        }
    }
}
