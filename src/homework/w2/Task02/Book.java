package homework.w2.Task02;
/*
Izveidojiet klasi Book, kurai ir jāapraksta grāmata.
        Grāmatai ir jābūt šādiem atribūtiem:

        autors
        izlaiduma gads
        nosaukums
        lapu skaits
        Katram atribūtam ir jabūt metodei, ar kuras palīdzību var ievadīt uz izgūt šī atribūta vērtību ("geteri" un "seteri").

        Uzraikstiet "main" metodi, kurā izveidojat 3 Book objektus ar dažādiem atribūtiem.

        Piemēram:

        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert Martin");
*/
//Ok
public class Book {
    private String title;
    private String author;
    private int year;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
