package lambdas.calculadora;

public class Divisao implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a / b;
    }

}
