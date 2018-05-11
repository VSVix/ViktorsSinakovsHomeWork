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
public class main {
    public static void main(String[] args) {
        Book cleanCode = new Book();
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert Martin");
        cleanCode.setYear(2008);
        cleanCode.setPages(464);

        Book briefHistoryOfTime = new Book();
        briefHistoryOfTime.setTitle("A Brief History of Time");
        briefHistoryOfTime.setAuthor("Stephen Hawking");
        briefHistoryOfTime.setYear(1998);
        briefHistoryOfTime.setPages(212);

        Book divergent = new Book();
        divergent.setTitle("Divergent");
        divergent.setAuthor("Veronica Roth");
        divergent.setYear(2011);
        divergent.setPages(496);

    }
}
