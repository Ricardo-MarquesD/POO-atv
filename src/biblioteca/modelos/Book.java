package biblioteca.modelos;
public class Book extends Publication implements Digitalization {
    // Atributos específicos de Livro
    private int volume;
    private String isbn;
    private String genre;
    private int chapter;
  
    public Book(String title, String author, String editor, int pages, int volume, String isbn, String genre, int chapter) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pages = pages;
        this.volume = volume;
        this.isbn = isbn;
        this.genre = genre;
        this.chapter = chapter;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getChapter() {
        return chapter;
    }
    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    @Override
    public void exhibtBookInfo() {
        // Chamamos primeiro o método da superclasse para mostrar atributos comuns
        super.exhibtBookInfo();

        // Depois exibimos atributos específicos de "Livro"
        System.out.println("Gênero: " + genre);
        System.out.println("Volume: " + volume);
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de capítulos: " + chapter);
        System.out.println("Tipo de publicação: Livro");
    }

    /*
     Método da interface Digitalizavel que somos obrigados a implementar,
     já que "Livro" declarou "implements Digitalizavel".
     */
    @Override
    public void DigitalVersion() {
        System.out.println("Há uma versão digital do livro disponível para você!");
    }
}