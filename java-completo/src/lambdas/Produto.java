package lambdas;

public class Produto extends Object { // Object -> classe mãe de toda classe em Java.

    public final String nome;
    public final Double preco;
    public final Double desconto;

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String toString() {
        return nome + " tem o preco de R$" + preco;
    }

}
