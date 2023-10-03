package oo.composicao.desafio1;

import java.util.ArrayList;

public class Sistema {

    public static void main(String[] args) {

        var compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.70, 100);
        compra1.adicionarItem("Notebook", 3999.90, 5);

        var compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10.0, 10);
        compra2.adicionarItem("Celular", 1199.99, 1);

        var cliente = new Cliente("Rodrigo Queiroz");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }

}
