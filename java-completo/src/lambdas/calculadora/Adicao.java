package lambdas.calculadora;

public class Adicao implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a + b;
    }

}
