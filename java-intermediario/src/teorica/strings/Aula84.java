package teorica.strings;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {
        String doArquivo = "1;Antonio;30";
        var st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
