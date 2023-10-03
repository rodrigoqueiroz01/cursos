package teorica.classes_utilitarias;

public class AulaMath {

    public static void main(String[] args) {
        System.out.println("Funções de ARREDONDAMENTO");
        System.out.println("Pow - " + Math.pow(2, 3)); // elevação

        System.out.println("Round - " + Math.round(4.5)); // arredonda o valor -> acima do .5 pra cima

        System.out.println("Round - " + Math.round(4.4)); // arredonda o valor -> abaixo do .5 pra baixo

        System.out.println("Ceil - " + Math.ceil(4.4)); // arredonda o valor sempre para cima.

        System.out.println("Ceil - " + Math.ceil(4.7)); // arredonda o valor sempre para cima.

        System.out.println("Floor - " + Math.floor(4.7)); // arredonda o valor sempre para baixo.

        System.out.println("\nFunções para GERAR NÚMERO ALEATÓRIO");
        System.out.println("Radom - " + Math.random()); // gera vários números com várias casas decimais

        System.out.println("Math.round(Math.random() * num)) " + Math.round(Math.random() * 100)); // gera um número aleatório a partir de uma certa quantidade

        System.out.println("\nFunções TRIGONOMÉTRICAS");
        System.out.println(Math.sin(Math.toRadians(30))); // gera o seno

        System.out.println(Math.cos(Math.toRadians(1))); // gera coseno

        System.out.println(Math.tan(Math.toRadians(45))); // tangente
    }

}
