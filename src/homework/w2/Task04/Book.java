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
//Ok
public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Title: '" + title+
                "', Author: "+author+
                ", Year: "+year+
                ", Page count: "+pages
                ;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
}
