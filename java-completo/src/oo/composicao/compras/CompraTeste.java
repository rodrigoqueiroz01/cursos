package oo.composicao.compras;

public class CompraTeste {

    public static void main(String[] args) {
        var compra1 = new Compra();
        compra1.cliente = "pedro";

        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem(new Item("Borracha", 12, 8.89));
        compra1.adicionarItem(new Item("Caderno", 3, 18.89));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());

        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();

        System.out.println("O total é " + total);
    }

}
