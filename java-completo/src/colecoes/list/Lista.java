package colecoes.list;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Rodrigo");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Paola"));
        lista.add(new Usuario("Pablo"));
        lista.add(new Usuario("Rafael"));

        System.out.println(lista.get(3));   // acessar pelo índice.

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Rafael")));

        System.out.println(lista.contains("tem? " + new Usuario("Carlos")));

        for(Usuario u : lista) {
            System.out.println(u.nome);
        }
    }

}
