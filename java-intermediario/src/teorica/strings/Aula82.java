package teorica.strings;

public class Aula82 {

    // join (juntar): sequência de caracteres / teoricas.strings
    // split (dividir): separar

    public static void main(String[] args) {
        String alfabeto = String.join(", ", "A", "B", "C", "D"); // primeiro "" gera o que fazer entre os elementos.
        System.out.println(alfabeto);

        String[] letras = alfabeto.split(", "); // faz separação
        for (String letra : letras) {
            System.out.println(letra);
        }

        String doArquivo = "1;Antonio;30";
        String[] infos = doArquivo.split(";");

        var pessoa = new Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
    }
}
