package fundamentos;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        // byte
        Byte b = 100;
        Short s = 1000;

        // Integer i = Integer.parseInt(scanner.next());
        Integer i = 10000;  // int
        Long l = 10000L;

        Float f = 123F;
        System.out.println(f);

        Double d = 1.5;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        Character c = '#';  // char
        System.out.println(c + "...");

    }

}
