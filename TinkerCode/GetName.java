package TinkerCode;

import java.util.Scanner;

public class GetName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String validatedInput = null;
        boolean validationInProgress = true;

        while (validationInProgress) {
            System.out.print("Wat is je naam?: ");
            String input = scanner.nextLine();

            if (input.length() < 2) {
                System.out.println("fout => een naam moet minstens 2 letters zijn!");
            } else {
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    String ch = Character.toString(c);
                    if (!ch.matches("^[a-zA-Z\"  \"]*$")) {
                        System.out.println("fout => '" + ch + "' is geen letter!");
                        break;
                    } else if (i == input.length() - 1) {
                        validatedInput = input;
                        validationInProgress = false;
                    }
                }
            }
        }
        String formattedName = validatedInput.substring(0, 1).toUpperCase() + validatedInput.substring(1, validatedInput.length()).toLowerCase();
        System.out.println("Welkom " + formattedName + "!");
    }
}
