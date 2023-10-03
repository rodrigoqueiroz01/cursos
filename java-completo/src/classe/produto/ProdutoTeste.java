package classe.produto;

public class ProdutoTeste {

    public static void main(String[] args) {

        var p1 = new Produto("Notebook", 4100.00);

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("Preço final 1: " + precoFinal1);
        System.out.println("Preço final 2: " + precoFinal2);
        System.out.printf("Média do carrinho: R$%.2f", mediaCarrinho);

    }

}
