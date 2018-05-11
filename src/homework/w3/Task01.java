package homework.w3;
/*
Programma prasa lietotājam ievadīt nenoteiktu daudzumu simbolu rindu.

Par ievades beigām jāuzskata tukšu rindu.

Programmai ir jāsaglabā tikai unikālās rindas, atmetot dublikātus. Realizācijai jaizmanto kolekcija "Set".

Pēc datu ievades, programmai ir jāsakārto rindas alfabēta secībā un izvadīt tās konsolē sakārtotā kartībā.

 */

import java.util.*;

//Ok
public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text. To finish, enter empty line:");

        Set inSet = new HashSet();
        String input = scanner.nextLine();

        while (!input.isEmpty()) {
            inSet.add(input);
            input = scanner.nextLine();
        }

        TreeSet<String> sorted = new TreeSet<String>(inSet);
        System.out.println("HashSet sorted using TreeSet : \n" + sorted);


    }
}
