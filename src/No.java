public class No {
    private String conteudo;
    No direita;
    No esquerda;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.esquerda = null;
        this.direita = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    
}