package streams.maps;

import streams.Utilitarios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import static streams.Utilitarios.*;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

        System.out.println("\n\nUsando composição...");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);

    }
}
