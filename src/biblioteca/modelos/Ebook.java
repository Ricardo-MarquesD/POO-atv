package biblioteca.modelos;

public class Ebook extends DigitalPublication {

    private String format; 

    public String getFormato() {
        return format;
    }
    public void setFormato(String format) {
        this.format = format;
    }
   
    @Override
    public void download() {
        System.out.println("Baixando e-book " + getTitle() + " em formato " + this.format);
    }

}
