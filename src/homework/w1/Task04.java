package homework.w1;

import java.util.Arrays;
import java.util.Scanner;

/*
Virknes konvertēšana

Programmas galvenā doma ir virkņu konvertēšana skaitļos.

Double un Integer objektiem ir pieejamas metodes,
kuras nodrošina virknes konvertēšanu skaitlī.
Programmā šīs metodes ir jāizmanto, lai iegūtu pareizu rezultātu.

Piemēram:
String str "1234";
int number = Integer.parseInt(str);

Uzrakstiet programmu, kura kā ieejas parametru no lietotāja saņem virkni.
Virknei ir jābūt skaitļiem atdalītiem ar atstarpi (piemēram, "11 2 36.4 4 8.9 7.6 3 256").
Virkni ir nepieciešams sadalīt un konvertēt skaitļos, kuru summu pēc tam izvada uz ekrāna.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers splitted with space:");
        String input = scanner.nextLine();

        try {
            Double stringSum = sumDouble(input);
            System.out.println("All numbers SUM = " + stringSum);
        } catch (NumberFormatException ex) {
            System.out.println("Inputted not a number - " + ex.getMessage().substring(18));
        }

    }

    private static Double sumDouble(String input) {
        Double sum = 0.;
        String[] elements = input.split("\\s+");

        for (int i = 0; i < elements.length; i++) {
            sum += Double.parseDouble(elements[i]);
        }
        return sum;
    }
}
