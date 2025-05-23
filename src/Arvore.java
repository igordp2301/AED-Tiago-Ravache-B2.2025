
import java.util.ArrayList;
import java.util.List;



public class Arvore {
    private No raiz;

    public Arvore(){
        No noD = new No("D");
        No noE = new No("E");
        No noF = new No("F");

        No noB = new No("B");
        noB.esquerda = noD;
        noB.direita = noE; // Corrigido aqui

        No noC = new No("C");
        noC.direita = noF;

        No noA = new No("A");
        noA.esquerda = noB;
        noA.direita = noC;

        this.raiz = noA;
    }
    
    public int contarNos(){
        return contarNos(raiz);
    }

    public int contarNos(No no){
        if(no == null){
            return 0;
        } else {
            return 1 + contarNos(no.esquerda) + contarNos(no.direita);
        }
    }

    public void exibirPreOrdemRec(){
        if(raiz == null){
            System.out.println("Árvore vazia.");
        } else {
            System.out.println("Pré-órdem recursivo: ");
            preOrdemRecursivo(raiz);
        }
    }

    public void preOrdemRecursivo(No no){
        if(no != null){
            System.out.println(no.getConteudo() + " ");
            preOrdemRecursivo(no.esquerda);
            preOrdemRecursivo(no.direita);
        }
    }

    public void exibirEmOrdemRec(){
        if(raiz == null){
            System.out.println("Árvore vazia.");
        } else {
            System.out.println("Em-órdem recursivo: ");
            emOrdemRecursivo(raiz);
        }
    }

    public void emOrdemRecursivo(No no){
        if (no != null) {
            emOrdemRecursivo(no.esquerda);
            System.out.println(no.getConteudo() + " ");
            emOrdemRecursivo(no.direita);
        }
    }

    public void preOrdem() {
    List<String> nosLista = new ArrayList<>();

    No no = raiz;
    while (no != null) {

        nosLista.add(no.getConteudo());

        if (no == raiz) {
            no = raiz.esquerda;
        } else if (no == raiz.esquerda) {

            no = raiz.esquerda.esquerda;
        } else if (no ==  raiz.esquerda.esquerda) {
            no = raiz.esquerda.direita;
        } else if (no == raiz.esquerda.direita) {
            no = raiz.direita;
        } else if (no == raiz.direita) {
            no = raiz.direita.direita;
        } else {

            no = null;
        }
    }

    System.out.println("Pré-ordem sem recursividade: " + nosLista);
}

public void emOrdem() {
    List<String> nosLista = new ArrayList<>();

    No no = raiz;
    int contagem = 0;

    while (no != null) {
        if (no == raiz && contagem == 0) {
            no = raiz.esquerda.esquerda; 
        } else if (no == raiz.esquerda.esquerda) {
            nosLista.add(no.getConteudo()); 
            no = raiz.esquerda;
            contagem = 1;
        } else if (no == raiz.esquerda && contagem == 1) {
            nosLista.add(no.getConteudo()); 
            no = raiz.esquerda.direita; 
            contagem = 2;
        } else if (no == raiz.esquerda.direita && contagem == 2) {
            nosLista.add(no.getConteudo()); 
            no = raiz; 
            contagem = 3;
        } else if (no == raiz && contagem == 3) {
            nosLista.add(no.getConteudo()); 
            no = raiz.direita; 
            contagem = 4;
        } else if (no == raiz.direita && contagem == 4) {
            nosLista.add(no.getConteudo());
            no = raiz.direita.direita; 
            contagem = 5;
        } else if (no == raiz.direita.direita && contagem == 5) {
            nosLista.add(no.getConteudo()); 
            no = null; 
        } else {
            no = null; 
        }
    }

    System.out.println("Em-ordem sem recursividade: " + nosLista);
}

    public void exibirPosOrdemRec() {
    if (raiz == null) {
        System.out.println("Árvore vazia.");
    } else {
        System.out.println("Pós-ordem recursivo: ");
        posOrdemRecursivo(raiz);
    }
}

public void posOrdemRecursivo(No no) {
    if (no != null) {
        posOrdemRecursivo(no.esquerda);
        posOrdemRecursivo(no.direita);
        System.out.println(no.getConteudo() + " ");
    }
}


 public void posOrdem() {
    List<String> nosLista = new ArrayList<>();

    No no = raiz;
    int contagem = 0;

    while (no != null) {
        if (no == raiz.esquerda.esquerda && contagem == 0) {
            nosLista.add(no.getConteudo());
            no = raiz.esquerda.direita;
            contagem = 1;
        } else if (no == raiz.esquerda.direita && contagem == 1) {
            nosLista.add(no.getConteudo());
            no = raiz.esquerda;
            contagem = 2;
        } else if (no == raiz.esquerda && contagem == 2) {
            nosLista.add(no.getConteudo());
            no = raiz.direita.direita;
            contagem = 3;
        } else if (no == raiz.direita.direita && contagem == 3) {
            nosLista.add(no.getConteudo());
            no = raiz.direita;
            contagem = 4;
        } else if (no == raiz.direita && contagem == 4) {
            nosLista.add(no.getConteudo());
            no = raiz;
            contagem = 5;
        } else if (no == raiz && contagem == 5) {
            nosLista.add(no.getConteudo());
            no = null;
        } else {
            no = raiz.esquerda.esquerda;
            contagem = 0;
        }
    }

    System.out.println("Pós-ordem sem recursividade: " + nosLista);
}



}
