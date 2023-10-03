package classe.data;

public class DataTeste {

    public static void main(String[] args) {

        var d1 = new Data();
        d1.dia = 21;
        d1.mes = 03;
        d1.ano = 1999;

        var d2 = new Data();
        var d3 = new Data(23, 11, 2022);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
        System.out.println(d3.obterDataFormatada());

    }

}
