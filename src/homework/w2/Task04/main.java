package homework.w2.Task04;

/*
Visas klases ir apakšklases klasei Object jeb Object klase ir super klase jebkurai citai klasei.
Object klase ir klašu hierarhijā pašā saknē.
Klase Object ar savu metožu palīdzību nosaka visām klasēm noteiktas pamat īpašības.
Klasei Object ir metode toString(), kura izvada informāciju par objektu teksta formā (parasti datu "logošanas" nolūkā).

Uzdevums: pārrakstīt metodi "toString()" klasē Book tā, lai tā izvadītu objekta Book aprakstošu tekstu, kas iekļauj arī atribūtu vērtības.
Demonstrācijai izmantojiet metodi "main()".

Piemēram:

Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
System.out.println(powerOfNow);
*/
public class main {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code","Robert Martin",2008,464);
        System.out.println(cleanCode);

        Book briefHistoryOfTime = new Book("A Brief History of Time","Stephen Hawking",1998,212);
        System.out.println(briefHistoryOfTime);

        Book divergent = new Book("Divergent","Veronica Roth",2011,496);
        System.out.println(divergent);

    }
}
