package biblioteca.modelos;

public abstract class DigitalPublication extends Publication {

    
    protected int sizeMB;
    
    public DigitalPublication(String title, String author, String editor, int pages, int sizeMB) {
        super(title, author, editor, pages);
        if(sizeMB != (int)sizeMB){
            throw new IllegalArgumentException("Ebook values is invalid.");
        }
        this.sizeMB = sizeMB;
    }
    public int getTamanhoEmMB() {
        return sizeMB;
    }

    public abstract void download();

    @Override
    public void exhibtBookInfo() {
        super.exhibtBookInfo();
        System.out.println("Tamanho do arquivo: " + this.sizeMB + " Mb");
    }
}
