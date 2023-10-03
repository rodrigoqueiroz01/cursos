package lanchonete;

public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.3);

        Pessoa pessoa = new Pessoa("Rodrigo", 114.5);

        System.out.println(pessoa.apresentar());

        pessoa.comer(c1);
        System.out.println(pessoa.apresentar());
        pessoa.comer(c1);
        System.out.println(pessoa.apresentar());
        pessoa.comer(c2);
        System.out.println(pessoa.apresentar());
    }

}
