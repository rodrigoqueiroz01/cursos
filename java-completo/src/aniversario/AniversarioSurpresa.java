package aniversario;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        var namorada = new Namorada();
        var porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(e -> {
            System.out.println("Surpresa via lambda!");
            System.out.println("Ocorreu em: " + e.getHoraChegada());
        });

        porteiro.start();
    }

}
