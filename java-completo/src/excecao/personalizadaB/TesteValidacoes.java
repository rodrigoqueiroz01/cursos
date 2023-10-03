package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        try {
            var aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaintervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("fim");
    }
}
