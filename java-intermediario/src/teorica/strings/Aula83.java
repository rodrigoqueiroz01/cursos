package teorica.strings;

public class Aula83 {

    public static void main(String[] args) {
        String[] letras = {"B", "C", "D", "E", "F"};

        String alfabeto = "";

        for (String letra : letras) {
            alfabeto += letra;
        }
        System.out.println("Método simples: " + alfabeto);

        var sb = new StringBuffer(); // ambientes que tenham mais de uma thread.
        for (String letra : letras) {
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println("Com String Buffer (usando toString()): " + alfabeto);

        alfabeto = new String(sb);
        System.out.println("Com String Buffer (usando new String(string buffer)): " + alfabeto);
    }

}
