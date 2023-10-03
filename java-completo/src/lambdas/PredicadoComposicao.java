package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999;

        System.out.println("É par? " + isPar.test(2));
        System.out.println("É par? " + isPar.or(isTresDigitos).test(2));
        System.out.println("É par? " + isPar.or(isTresDigitos).negate().test(2));

        System.out.println("É par? " + isPar.and(isTresDigitos).test(2));
        System.out.println("É par? " + isPar.and(isTresDigitos).negate().test(2));

        System.out.println("Tem 3 dígitos? " + isTresDigitos.test(222));

    }
}
