package classe.valorreferencia;

import classe.data.Data;

public class ValorVsReferencia {

    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuição por valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data();
        Data d2 = d1; // atribuição por referência (Objeto)

//        d1.dia = 21;
//        d1.mes = 12;
//        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

    }

}
