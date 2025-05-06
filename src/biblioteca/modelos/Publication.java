package biblioteca.modelos;

public class Publication {
    protected String title;
    protected String author;
    protected String editor;
    protected int pages;
    private double reviewSum; // Pode ser enviado para uma classe de avalições
    private int reviewtotal; // Pode ser enviado para uma classe de avalições

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
    public String getEditor() {
        return editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("O número de páginas deve ser maior que zero.");
        }
        this.pages = pages;
    }

    // Pode ser enviado para uma classe de avalições
    public double getReviewSum() {
        return reviewSum;
    }
    // Pode ser enviado para uma classe de avalições
    public void setReviewSum(double reviewSum) {
        this.reviewSum = reviewSum;
    }
    // Pode ser enviado para uma classe de avalições
    public int getReviewtotal() {
        return reviewtotal;
    }
    // Pode ser enviado para uma classe de avalições
    public void setReviewtotal(int reviewtotal) {
        this.reviewtotal = reviewtotal;
    }
    // Pode ser enviado para uma classe de avalições
    public void avalia(double nota) {
        reviewSum += nota;
        reviewtotal++;
    }
    // Pode ser enviado para uma classe de avalições
    public void review(int rate) {
      
        avalia((double)rate);
    }
    // Pode ser enviado para uma classe de avalições
    public void avalia(double[] reviews) {
        for (double review : reviews) {
            avalia(review);  
        }
    }
    // Pode ser enviado para uma classe de avalições
    public void validReview(double review) throws Exception {
        if (review < 0 || review > 10) {
            throw new Exception("Nota fora do intervalo permitido (0 a 10).");
        }
        avalia(review);
    }
    // Pode ser enviado para uma classe de avalições
    public double returnMedia() {       
        if (reviewtotal == 0) {
            return 0;
        }
        return reviewSum / reviewtotal;
    }
    // Pode ser enviado para uma classe de avalições
    public void exhibMedia() {
        System.out.println("Rates: " + returnMedia());
    }

    public void exhibtBookInfo() {
        System.out.println("\n--- Book Infos ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Editor: " + editor);
        System.out.println("pages: " + pages);
    }

}