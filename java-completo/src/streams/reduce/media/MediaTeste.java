package streams.reduce.media;

public class MediaTeste {

    public static void main(String[] args) {
        var m1 = new Media().adicionar(8.3).adicionar(6.7);
        System.out.println(m1.getValor());

        var m2 = new Media().adicionar(7.9).adicionar(6.6);
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }

}
