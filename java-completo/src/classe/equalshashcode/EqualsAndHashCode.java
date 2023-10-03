package classe.equalshashcode;

import java.util.Date;

public class EqualsAndHashCode {
    public static void main(String[] args) {

        var user1 = new Usuario();
        user1.nome = "Rodrigo";
        user1.email = "rodrigo@gmail.com";

        var user2 = new Usuario();
        user2.nome = "Rodrigo";
        user2.email = "rodrigo@gmail.com";

        var ex1 = user1 == user2;
        var ex2 = user1.equals(user2);
        var ex3 = user2.equals(user1);

        System.out.println("Exemplo 1: " + ex1);
        System.out.println("Exemplo 2: " + ex2);
        System.out.println("Exemplo 3: " + ex3);

        System.out.println(user2.equals(new Date()));

    }
}
