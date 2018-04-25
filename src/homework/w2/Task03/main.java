package homework.w2.Task03;

/*
Pievienojiet konstruktoru klasei "Book" no 2. uzdevuma, kurš uzreiz iestatīs visas atribūtu vērtības.

Piemēram:

Book powerOfNow = new Book("Power of Now", "Eckhart Tolle", 2001, 224);
System.out.println("Power of Now title: " + powerOfNow.getTitle());
utt.
*/
public class main {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code","Robert Martin",2008,464);
        System.out.println("cleanCode title: " + cleanCode.getTitle()+
                ", Author: "+cleanCode.getAuthor()+
                ", Year: "+cleanCode.getYear()+
                ", page count: "+cleanCode.getPages());

        Book briefHistoryOfTime = new Book("A Brief History of Time","Stephen Hawking",1998,212);
        System.out.println("briefHistoryOfTime title: " + briefHistoryOfTime.getTitle()+
                ", Author: "+briefHistoryOfTime.getAuthor()+
                ", Year: "+briefHistoryOfTime.getYear()+
                ", page count: "+briefHistoryOfTime.getPages());

        Book divergent = new Book("Divergent","Veronica Roth",2011,496);
        System.out.println("divergent title: " + divergent.getTitle()+
                ", Author: "+divergent.getAuthor()+
                ", Year: "+divergent.getYear()+
                ", page count: "+divergent.getPages());

    }
}
