package atividade.enums;

public class CalculadoraTeste {

    public static void main(String[] args) {
        var x = 2.0;
        var y = 3.0;

        for (var operacao : Operacao.values()) {
            System.out.println(x + " ");
            System.out.println(operacao.toString() + " ");
            System.out.println(y + " ");
            System.out.println(operacao.executarOperacao(x, y));
        }
    }

}
