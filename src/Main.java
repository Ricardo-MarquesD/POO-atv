import biblioteca.modelos.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Book myBook = new Book("Harry Potter e a Pedra Filosofal", "J. K. Rowlling", "Rocco", 208, 1, "9780545069670","Fantasia", 17);
        myBook.review(9);
        myBook.review(10.0);
        myBook.review(8.5);
        myBook.exhibtBookInfo();

        Magazine myMagazine = new Magazine("Revista C&C", "Grupo Bananas", "Folha de Banana", 47, "19 de março de 2020", "Ciência bananal", "1002-132-1121-13", 10);
        myMagazine.review(9.5);
        myMagazine.review(8);
        myMagazine.review(7.7);
        myMagazine.exhibtBookInfo();

        Ebook myEbook = new Ebook("Clean Code: A Handbook og Agile So", "Robert C. Martin", "Prentice Hall", 464, 45, "ePUB");
        myEbook.review(10);
        myEbook.review(9.5);
        myEbook.exhibtBookInfo();
        myEbook.download();

        List<Publication> pubList = new ArrayList<>();
        pubList.add(myBook);
        pubList.add(myMagazine);
        pubList.add(myEbook);

        System.out.println("\n=== LISTA DE PUBLICAÇÕES ===");
        for (Publication pub : pubList) {
            pub.exhibtBookInfo();
            System.out.println("Média de Avaliações: " + pub.returnMedia());
            if (pub instanceof Digitalization) {
                ((Digitalization) pub).DigitalVersion();
            }
        }
    }
}
