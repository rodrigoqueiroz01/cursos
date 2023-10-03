package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        var caixaA = new CaixaInt();
        caixaA.setCoisa(123);

        var coisaA = caixaA.getCoisa();
        System.out.println(coisaA);

    }

}
