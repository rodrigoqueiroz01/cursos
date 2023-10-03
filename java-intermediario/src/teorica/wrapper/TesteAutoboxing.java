package teorica.wrapper;

public class TesteAutoboxing {

    public static void main(String[] args) {
        // autoboxing
        Short n1 = 1;
        Byte n2 = 10;
        Integer n3 = 100;
        Long n4 = 1L; // new Long(1L); -> por trás dos panos
        Float n5 = 3.5F; // new Float(3.5F);
        Double n6 = 3.5;
        Boolean flag = true;
        Character a = 'a';

        // auto un-boxing
        int n7 = n3; // n3.intValue();

        // autoboxing em expressões
        n3++;

        System.out.println(n3);

        // auto unboxing n3 -> autoboxing n7/n3 -> n8
        Integer n8 = n7 / n3;

        // se fizer muita manipulação de dados, é melhor usar tipos primitivos.
    }
}
