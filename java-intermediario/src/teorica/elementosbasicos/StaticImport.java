package teorica.elementosbasicos;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class StaticImport {

    public static void main(String[] args) {
        double a = 2 ;
        double b = 3;
        double c = 4;

        var potencia = Math.pow(a, b);
        System.out.println("Potência: " + potencia);

        var raizQuadrada = Math.sqrt(c);
        System.out.println("Raiz Quadrada" + raizQuadrada);

        System.out.println(pow(a, b));
        System.out.println(sqrt(c));
    }

}
