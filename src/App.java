public class App {
    public static void main(String[] args) throws Exception {
        Arvore arvore = new Arvore();

        System.out.println(arvore.contarNos());
        System.out.println("----------------");

        //arvore.exibirPreOrdemRec(); //A B D E C F
        //System.out.println("-----------------");
        //arvore.preOrdem(); //A B D E C F

        //arvore.exibirEmOrdemRec(); // D B E A C F
        //arvore.emOrdem(); // D B E A C F 
        System.out.println("-------------------");

        //arvore.exibirPosOrdemRec();// D E B F C A
        //arvore.posOrdem();// D E B F C A
        System.out.println("-------------------");

        
    }


}
