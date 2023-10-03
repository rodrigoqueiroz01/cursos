package aniversario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversarianteObserver(ChegadaAniversarianteObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        var scanner = new Scanner(System.in);
        while (true) {
            int valor = scanner.nextInt();

            if (valor == 1) {
                var event = new ChegadaAniversarianteEvent(new Date());

                for (ChegadaAniversarianteObserver observer : this.observers) {
                    observer.chegou(event);
                }

                scanner.close();
            } else {
                System.out.println("Alarme falso !!!");
            }
        }
    }

}
