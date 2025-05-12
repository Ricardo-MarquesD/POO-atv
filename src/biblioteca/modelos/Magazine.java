package biblioteca.modelos;
public class Magazine extends Publication implements Digitalization {
    private String edition;
    private String subject;
    private String issn;
    private int numberOfArticles;
        
    public Magazine(String title, String author, String editor, int pages, String edition, String subject, String issn, int numberOfArticles){
        super(title, author, editor, pages);
        try{
            this.edition = edition;
            this.subject = subject;
            this.issn = issn;
            this.numberOfArticles = numberOfArticles;
        }catch(IllegalArgumentException e){
            System.err.println("Input Magazine() values is invalid: " + e.getMessage());
        }
    }

    public String getEdition() {
        return edition;
    }
    public String getsubject() {
        return subject;
    }
    public String getIssn() {
        return issn;
    }
    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    @Override
    public void exhibtBookInfo() {
        super.exhibtBookInfo();

        System.out.println("Assunto: " + subject);
        System.out.println("Edição: " + edition);
        System.out.println("ISSN: " + issn);
        System.out.println("Número de artigos: " + numberOfArticles);
        System.out.println("Tipo de publicação: Revista");
    }

    @Override
    public void DigitalVersion() {
        System.out.println("Gerando versão digital da revista: " + getTitle());
    }
}