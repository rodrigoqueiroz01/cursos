package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        var caixaA = new CaixaNumero<Double>();
        caixaA.setCoisa(2.3);
        System.out.println(caixaA.getCoisa());

        var caixaB = new CaixaNumero<Integer>();
        caixaB.setCoisa(123);
        System.out.println(caixaB.getCoisa());

    }
}
