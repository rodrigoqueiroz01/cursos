package fundamentos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Data {

    public static void main(String[] args) {

        int dia = 31;
        int mes = 10;
        int ano = 2022;

        System.out.println(dia + "/" + mes + "/" + ano);

        var localDateTime = LocalDate.now();
        System.out.println(localDateTime);

    }

}
