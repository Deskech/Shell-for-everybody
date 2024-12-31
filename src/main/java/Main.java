import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean exit = false;

        do {

            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("exit 0")) {
                exit = true;
            } else if (input.matches("^echo .+")) {
                String filteredData = input.replace("echo", " ");
                System.out.println(filteredData);
            } else {
                System.out.println(input + ": command not found");
            }

        } while (!exit);
    }
}
