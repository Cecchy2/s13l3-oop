package esercizio3;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Cliente cliente1 = new Cliente(random, "Dario", "Cecchinato", "dariocecchinato@xxxxx.com", LocalDate.now());

        Articolo articolo1 = new Articolo(random.toString(), "orologio", 90, 4);
        Articolo articolo2 = new Articolo(random.toString(), "LongBoard", 120, 2);
        Articolo articolo3 = new Articolo(random.toString(), "phone", 600, 40);

        Carrello carrello = new Carrello(cliente1);


    }
}
