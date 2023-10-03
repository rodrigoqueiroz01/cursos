package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro = produto -> (produto.preco * (1 - produto.desconto)) >= 750;

        var produto = new Produto("Notebook", 4100.00, 0.15);
        System.out.println(isCaro.test(produto));
    }
}
