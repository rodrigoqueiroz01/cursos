package generics;

public class ParesTeste {

    public static void main(String[] args) {

        var resutladosConcurso = new Pares<Integer, String>();

        resutladosConcurso.adicionar(1, "Maria");
        resutladosConcurso.adicionar(2, "Pedro");
        resutladosConcurso.adicionar(3, "Gui");
        resutladosConcurso.adicionar(4, "Ana");
        resutladosConcurso.adicionar(2, "Rebeca");

        System.out.println(resutladosConcurso.getValor(1));
        System.out.println(resutladosConcurso.getValor(4));
        System.out.println(resutladosConcurso.getValor(2));

    }

}
