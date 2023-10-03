package streams.filters.desafio01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio01 {

    public static void main(String[] args) {

        var p1 = new Produto("Caneta", "BIC", 1.5);
        var p2 = new Produto("Borracha", "BIC", 0.80);
        var p3 = new Produto("Caderno", "China", 15.0);
        var p4 = new Produto("Mochila", "China", 150.0);
        var p5 = new Produto("Tênis", "Nike", 459.99);
        var p6 = new Produto("Camisa", "Nike", 179.99);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

        Predicate<Produto> marca = m1 -> m1.getMarca().equals("Nike");
        Predicate<Produto> preco = pp -> pp.getPreco() >= 1.0 && pp.getPreco() < 180.00;
        Function<Produto, String> resultado = produto -> "O produto " + produto.getNome() + " da marca " + produto.getMarca() + " custa R$" + produto.getPreco();

        produtos.stream()
                .filter(marca)
                .filter(preco)
                .map(resultado)
                .forEach(System.out::println);
    }

}
