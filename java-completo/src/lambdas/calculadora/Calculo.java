package lambdas.calculadora;

@FunctionalInterface // força a ter apenas um único método
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "muito legal!";
    }

}
