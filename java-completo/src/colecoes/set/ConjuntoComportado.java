package colecoes.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

//        Set<String> listaCandidatos = new HashSet<>();
        SortedSet<String> listaCandidatos = new TreeSet<>();
        listaCandidatos.add("Rodrigo");
        listaCandidatos.add("Paola");
        listaCandidatos.add("Eveliny");
        listaCandidatos.add("Pablo");

        for (String candidato : listaCandidatos) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);

        for (Integer n : nums) {
            System.out.println(n);
        }

    }
}
