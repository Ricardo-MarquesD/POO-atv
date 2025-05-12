package biblioteca.modelos;
public class Book extends Publication implements Digitalization {
    private int volume;
    private String isbn;
    private String genre;
    private int chapter;
  
    public Book(String title, String author, String editor, int pages, int volume, String isbn, String genre, int chapter) {
        super(title, author, editor, pages);
        try{
            this.volume = volume;
            this.isbn = isbn;
            this.genre = genre;
            this.chapter = chapter;
        }catch(IllegalArgumentException e){
            System.err.println("Invalid input, error: " + e.getMessage());
        }
    }

    public int getVolume() {
        return volume;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getGenre() {
        return genre;
    }
    public int getChapter() {
        return chapter;
    }

    @Override
    public void exhibtBookInfo() {
        super.exhibtBookInfo();

        System.out.println("Gênero: " + genre);
        System.out.println("Volume: " + volume);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de capítulos: " + chapter);
        System.out.println("Tipo de publicação: Livro");
    }

    @Override
    public void DigitalVersion() {
        System.out.println("Há uma versão digital do livro disponível para você!");
    }
}