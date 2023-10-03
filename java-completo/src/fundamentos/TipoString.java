package fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá mundo!".charAt(2));

        String s = "Boa tarde";
        s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toUpperCase().startsWith("BOA"));

        System.out.println();

        var nome = "Rodrigo";
        var sobrenome = "Queiroz";
        var idade = 23;
        var salario = 1000.0;

        System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome +
                " \nIdade: " + idade + " anos \nSalário: R$" + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f ao mês.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f por mês.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

    }

}
