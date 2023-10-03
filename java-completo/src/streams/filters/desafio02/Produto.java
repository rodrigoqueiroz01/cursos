package streams.filters.desafio02;

public class Produto {

    private String nome;
    private double preco;
    private double desconto;
    private double frete;

    public Produto(String nome, double preco, double desconto, double frete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.frete = frete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    @Override
    public String toString() {
        return "Produto - Nome: " + nome + ", Preco: R$" + preco + ", Desconto R$" + desconto + ", Frete: R$" + frete;
    }

}
