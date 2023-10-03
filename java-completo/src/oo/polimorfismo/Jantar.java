package oo.polimorfismo;

public class Jantar {

    public static void main(String[] args) {
        var convidado = new Pessoa(99.65);
        var ingrediente1 = new Arroz(0.2);
        var ingrediente2 = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

        System.out.println(convidado.getPeso());

        var sobremesa = new Sorvete(0.4);
        convidado.comer(sobremesa);

        System.out.println(convidado.getPeso());
    }

}
