package produto;

public class ProdutoTeste {
    public static void main(String[] args) {

        var n1 = new Produto();
        n1.nome = "Caneta";

        var n2 = new Produto();
        n2.nome = "Caneta";

        /*
         * n1 e n2 tem espaços diferentes na memória do computador.
         */

        boolean verdadeiroOuFalso = n1.equals(n2);

        System.out.println("Verdadeiro ou falso: " + verdadeiroOuFalso);

    }
}
