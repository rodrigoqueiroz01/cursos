package teorica.strings;

public class Aula80 {

    public static void main(String[] args) {
        String teste = "Isso é um teste...";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        String ola = "olá";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo); // ola + mundo / concatena as teoricas.strings
        System.out.println(olaMundo);

        String espacos = "i s p a c o";
        String alteraErroETiraEspacos = espacos.replace('i', 'e'); // altera o 'i' pelo 'e'
        System.out.println("Altera erro: " + alteraErroETiraEspacos);

        alteraErroETiraEspacos = alteraErroETiraEspacos.replaceAll(" ", ""); // remove os espaços / regex: o que quero alterar / replacement: o que quero pôr
        System.out.println("Remove os espaços: " + alteraErroETiraEspacos);
    }
}
