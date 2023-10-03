package teorica.annotations;

public @interface InformacaoAula {
    String autor();

    int numeroAula();

    String blog() default "https://rodrigo.com";

    String site() default "https://rodrigo-dev.com";
}
