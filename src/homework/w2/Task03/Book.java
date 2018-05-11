package homework.w2.Task03;
/*
Pievienojiet konstruktoru klasei "Book" no 2. uzdevuma, kurš uzreiz iestatīs visas atribūtu vērtības.

Piemēram:

Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
System.out.println("Power of Now title: " + powerOfNow.getTitle());
utt.
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
