package homework.w1;

import java.util.Scanner;

/*
Uzrakstīt programmu, kas pārbauda vai ievadītā simbolu virkne ir simetriska.
Piemēram:

    "asa" - simetriska
    "asdf" - nesimetriska

Papildus var mēgināt neizmantot ciklus.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input symbols:");
        String inputA = scanner.next();
        isSymmetric(inputA);
    }

    private static void isSymmetric(String input) {
        String left, right;
        StringBuilder reverse = new StringBuilder();
        if (input.length()%2 == 0) {
            right = input.substring(input.length()/2,input.length());
        } else {
            right =input.substring(input.length()/2+1,input.length());
        }
        left = input.substring(0,input.length()/2);
        reverse.append(right);
        reverse=reverse.reverse();
        System.out.println(left.contentEquals(reverse) ? "Is Symmetric!" : "Is Asymmetric!");
    }
}
