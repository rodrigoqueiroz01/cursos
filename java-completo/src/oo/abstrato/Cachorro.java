package oo.abstrato;

public class Cachorro extends Mamifero {

    // não é obrigado a implementar o método mover, pois já foi definido na classe Mamifero.
    @Override
    public String mover() {
        return null;
    }

    @Override
    public String mamar() {
        return "Usando leite";
    }
}
