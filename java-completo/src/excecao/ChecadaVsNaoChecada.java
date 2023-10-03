package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        geraErro1();

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim!");
    }

    public static void geraErro1() {
        // Exceção NÃO checada ou não verificada
        throw new RuntimeException("ERRO: Ocorreu um erro! #01");
    }

    public static void geraErro2() throws Exception {
        // Exceção checada ou verificada
        throw new Exception("ERRO: Ocorreu um erro! #02");
    }

}
