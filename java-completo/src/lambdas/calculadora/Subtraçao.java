package lambdas.calculadora;

public class Subtraçao implements Calculo {

    @Override
    public double executar(double a, double b) {
        return a - b;
    }

}
