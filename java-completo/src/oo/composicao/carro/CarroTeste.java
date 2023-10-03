package oo.composicao.carro;

public class CarroTeste {

    public static void main(String[] args) {

        var carro = new Carro();
        System.out.println(carro.estaLigado());

        carro.ligar();
        System.out.println(carro.estaLigado());
        System.out.println(carro.motor.giros());

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        carro.acelerar();
        System.out.println(carro.motor.giros());

        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        // faltou encapsulamento!!
        // carro.motor.fatorInjecao = -30;

        System.out.println(carro.motor.giros());

        // relação bidirecional
        System.out.println(carro.motor.carro.motor.carro.motor.giros());

    }

}
