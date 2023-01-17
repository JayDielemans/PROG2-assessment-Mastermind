package TinkerCode;

import java.util.Random;
import java.util.Scanner;

public class GetToss {

    public void DoToss(String name) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Eerst doen we een TOSS om wie mag beginnen.");

        String validatedToss = null;
        boolean inputIsInvalid = true;

        while (inputIsInvalid) {
            System.out.print("Wil je kop of munt? : ");
            String input = scanner.nextLine();
            String toss = input.toLowerCase();

            if ((!toss.equals("kop") && !toss.equals("munt"))) {
                System.out.println("fout => " + toss + " is geen geldige invoer!");
            } else {
                validatedToss = toss;
                inputIsInvalid = false;
            }
        }

        System.out.print("flipping: ");

        int head = 0;
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int num = rand.nextInt(2);

            if (num == 1) {
                head++;
                System.out.print("kop");
            } else {
                System.out.print("munt");
            }
            if (i < 4) {
                System.out.print("|");
            }
        }

        System.out.println();

        String winner;
        if (head > 2) {
            System.out.println("het is geworden : kop (" + head + " keer gegooid)");
            winner = "kop";
        } else {
            System.out.println("het is geworden : munt (" + (5 - head) + " keer gegooid)");
            winner = "munt";
        }

        if (validatedToss.equals(winner)) {
            System.out.println(name + " jij mag beginnen!");
        } else {
            System.out.println("De computer mag beginnen!");
        }
    }
}
