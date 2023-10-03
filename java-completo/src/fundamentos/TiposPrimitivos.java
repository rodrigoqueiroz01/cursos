package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // informações do funcionário

        // tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 3276;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = true;

        // tipo caractere
        char status = 'A';

        // dias de empresa
        System.out.println("Dias de empresa = " + anosDeEmpresa * 365);

        // número de viagens
        System.out.println("Número de viagens = " + numeroDeVoos / 2);

        // ponto por real
        System.out.println("Pontos por real = " + pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);

    }

}
