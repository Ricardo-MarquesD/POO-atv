package biblioteca.modelos;

public abstract class DigitalPublication extends Publication {

    // Atributo característico de publicações digitais
    protected int sizeMB;

    // Getter e Setter para o tamanho do arquivo digital
    public int getTamanhoEmMB() {
        return sizeMB;
    }
    public void setTamanhoEmMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }

    /*
     * Método abstrato: toda "PublicacaoDigital" precisa saber
     * como será feito o "download" (mas cada subclasse pode
     * implementar de maneira diferente).
     */
    public abstract void download();

    @Override
    public void exhibtBookInfo() {
        // Chama a exibição base da classe pai (exibe título, autor, etc.)
        super.exhibtBookInfo();
        // Acrescenta detalhes da publicação digital
        System.out.println("Tamanho do arquivo: " + this.sizeMB + " Mb");
    }
}
