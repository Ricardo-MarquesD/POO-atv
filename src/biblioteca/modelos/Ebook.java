package biblioteca.modelos;

public class Ebook extends DigitalPublication {

    
    private String format; 
    
    public Ebook(String title, String author, String editor, int pages, int sizeMB, String format) {
        super(title, author, editor, pages, sizeMB);
        this.format = format;
        if(format != (String)format){
            throw new IllegalArgumentException("Format is invalid.");
        }
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void download() {
        System.out.println("Baixando e-book " + getTitle() + " em formato " + this.format);
    }

}
