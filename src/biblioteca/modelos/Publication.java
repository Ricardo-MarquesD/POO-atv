package biblioteca.modelos;

public class Publication {
    private String title;
    private String author;
    private String editor;
    private int pages;
    private double reviewSum;
    private int reviewtotal;
    
    public Publication(String title, String author, String editor, int pages) {
        try{
            this.title = title;
            this.author = author;
            this.editor = editor;
            if (pages <= 0) {
                throw new IllegalArgumentException("O número de páginas deve ser maior que zero.");
            }
            this.pages = pages;
        }catch(IllegalArgumentException e){
            System.err.println("Input Publication() values is invalid: " + e.getMessage());
        }
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getEditor() {
        return editor;
    }
    public int getPages() {
        return pages;
    }
    public double getReviewSum() {
        return reviewSum;
    }
    public int getReviewtotal() {
        return reviewtotal;
    }
    
    public void review(double rate) {
        this.reviewSum += rate;
        this.reviewtotal++;
    }
    public void reviews(double[] reviews) {
        for (double review : reviews) {
            review(review);  
        }
    }
    public double returnMedia() {       
        if (reviewtotal == 0) {
            return 0;
        }
        return reviewSum / reviewtotal;
    }


    public void exhibMedia() {
        System.out.println("Rates: " + returnMedia() + "/10");
    }
    public void exhibtBookInfo() {
        System.out.println("\n--- Book Infos ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Editor: " + editor);
        System.out.println("pages: " + pages);
    }

}