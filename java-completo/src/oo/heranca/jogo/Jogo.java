package oo.heranca.jogo;

public class Jogo {

    public static void main(String[] args) {

        var monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        var heroi = new Heroi(10, 11);

        System.out.println("O herói tem => " + heroi.vida);
        System.out.println("O monstro tem => " + monstro.vida);

        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);

        System.out.println("O herói tem => " + heroi.vida);
        System.out.println("O monstro tem => " + monstro.vida);

    }

}
