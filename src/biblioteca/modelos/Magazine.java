package biblioteca.modelos;
public class Magazine extends Publication implements Digitalization {
    // Atributos específicos de Revista
    private String edition;
    private String subject;
    private String issn;
    private int numberOfArticles;

    public Magazine(String edition, String subject, String issn, int numberOfArticles){
        this.edition = edition;
        this.subject = subject;
        this.issn = issn;
        this.numberOfArticles = numberOfArticles;
        
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
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }
    public void setNumberOfArticles(int numberOfArticles) {
        this.numberOfArticles = numberOfArticles;
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