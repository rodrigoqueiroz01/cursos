package oo.heranca.desafio1;

public class CarroTeste {

    public static void main(String[] args) {

        var civic = new Civic();
        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        civic.acelerar();
        System.out.println(civic);

        var ferrari = new Ferrari(400);
        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.acelerar();
        System.out.println(ferrari);

        ferrari.frear();
        System.out.println(ferrari);

        ferrari.frear();
        System.out.println(ferrari);

    }

}
