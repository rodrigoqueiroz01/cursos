package teorica.wrapper;

public class TesteWrapper {

    public static void main(String[] args) {
        /*
        Tipos primitivos

        short num1 = 1;
        byte num2 = 10;
        int n3 = 100;
        long n4 = 1000L;
        float n5 = 3.5F;
        double n6 = 3.5;
        boolean flag = true;
        char a = 'a';
        */

        // Tipos Wrapper
        Short n1 = new Short((short) 1);
        Byte n2 = new Byte((byte) 10);
        Integer n3 = new Integer(100);
        Long n4 = new Long(1L);
        Float n5 = new Float(3.5F);
        Double n6 = new Double(3.5);
        Boolean flag = new Boolean(true);
        Character a = new Character('a');

        int num16 = Integer.parseInt("10000"); // converte double em String
        double num17 = Double.parseDouble("3.555"); // converte double em String

        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);
    }

}
