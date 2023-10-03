package classe.circunferencia;

public class AreaCircTeste {

    public static void main(String[] args) {

        var areaCirc1 = new AreaCirc(10);
//        areaCirc1.pi = 1000;

        var areaCirc2 = new AreaCirc(5);
//        areaCirc2.pi = 0;

//        AreaCirc.PI = 3.1415;

        System.out.println(areaCirc1.area());
        System.out.println(areaCirc2.area());

        System.out.println(AreaCirc.PI);

        AreaCirc areaCirc3 = new AreaCirc(1.2);
        areaCirc3.raio = 1.3;

        areaCirc3.area();
    }

}
