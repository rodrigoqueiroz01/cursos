package lambdas.calculadora;

public class CalculadoraTeste1 {

    public static void main(String[] args) {

        Calculo calculo = new Adicao();
        System.out.println(calculo.executar(2, 2));

        calculo = new Subtraçao();
        System.out.println(calculo.executar(2, 2));

        calculo = new Multiplicacao();
        System.out.println(calculo.executar(2, 2));

        calculo = new Divisao();
        System.out.println(calculo.executar(2, 2));

    }

}
