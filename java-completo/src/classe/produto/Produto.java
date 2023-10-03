package classe.produto;

public class Produto {

    static double desconto = 0.25;

    String nome;
    double preco;

    Produto() {

    }

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }

}
