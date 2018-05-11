package homework.w1;

import java.util.Scanner;

/*
Uzrakstiet programmu, kur lietotājam ievadot divas simbolu virknes,
programma tās savieno (konkatinē) un rezultātu izvada uz ekrāna.
*/
//OK
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input symbols:");
        String inputA = scanner.next();
        System.out.println("Input symbols again:");
        String inputB = scanner.next();
        String message = new StringBuilder(inputA).append(inputB).toString();
        System.out.println("Result message is: "+message);
    }
}
