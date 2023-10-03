package oo.faculdade.prova;

public class Multa {

    public static void main(String[] args) {

        double imposto = 1000.00, valorPagar, valorMulta, valorJurosDia;
        int diasAtraso = 10;
        double percentagemMultaAtraso = 2.0, percentagemJurosDia = 0.1;

        valorPagar = imposto;

        if (diasAtraso > 0) {
            valorMulta = valorPagar * (percentagemMultaAtraso) / 100;
            valorPagar += valorMulta;
            valorJurosDia = imposto * (percentagemJurosDia) / 100;
            valorPagar += valorJurosDia * diasAtraso;

            System.out.println("Valor para pagar hoje: " + valorPagar);

            for (int i = 1; i < 5; i++) {
                valorPagar += valorJurosDia;
                System.out.println("Valor para pagar hoje+" + i + ": " + valorPagar);
            }
        }

    }
}
