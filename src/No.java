public class No {
    private String conteudo;
    private No filhoEsq;
    private No filhoDir;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.filhoEsq = null;
        this.filhoDir = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getfilhoEsq() {
        return filhoEsq;
    }

    public void setfilhoEsq(No filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public No getfilhoDir() {
        return filhoDir;
    }

    public void setfilhoDir(No filhoDir) {
        this.filhoDir = filhoDir;
    }
}