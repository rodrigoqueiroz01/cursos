package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        var caixaA = new Caixa<String>();
        caixaA.setCoisa("Segredo");

        var coisaA = caixaA.getCoisa();
        System.out.println(coisaA);

        var caixaB = new Caixa<Double>();
        caixaB.setCoisa(3.4);

        var coisaB = caixaB.getCoisa();
        System.out.println(coisaB);

    }
}
