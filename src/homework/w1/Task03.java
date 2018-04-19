package homework.w1;

import java.util.Scanner;

/*
Uzrakstīt programma, kura spēj šifrēt un atšifrēt virknes.

Doma: programmai kā ievadparametrs tiek dota simbolu virkne,
programma to šifrē tā lai izslasīt to nebūtu iespējams.
Šifrēšanai var izmantot vienkāršas operācijas ar simboliem (piemēram, to nobīde).
Programmai ir jāmāk atšifrēt šifrētu virkni.
Šifrēšana un atšifrēšanai jābūt realizētai atsevišķās metodēs.
 */
public class Task03 {
    public static void main(String[] args) {
        int salt = 4;
        Scanner scanner = new Scanner(System.in );
        System.out.println("Input symbols:");
        String input = scanner.next();
        String encrypted = encrypt(input,salt);
        System.out.println("Encrypted data: "+encrypted);
        System.out.println(decrypt(encrypted,salt));


    }

    private static String decrypt(String encrypted, int salt) {
        String decryptedMessage = "";
        for(int i = 0; i < encrypted.length(); ++i){
            char ch = encrypted.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - salt);
                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }
                decryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - salt);
                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }
                decryptedMessage += ch;
            }
            else {
                decryptedMessage += ch;
            }
        }
        return decryptedMessage;
    }

    private static String encrypt(String message, int salt){
        String encryptedMessage = "";
        for(int i = 0; i < message.length(); ++i){
            char ch = message.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + salt);
                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                encryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + salt);
                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }
                encryptedMessage += ch;
            }
            else {
                encryptedMessage += ch;
            }
        }
        return encryptedMessage;
    }
}
