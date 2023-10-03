package oo.composicao.desafio1;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new Item(produto, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade) {
        var produto = new Produto("", 0);
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}
